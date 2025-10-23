package packages.base;

// package utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * Token Manager Utility for handling multiple user tokens dynamically.
 * Supports timestamp-based expiry tracking.
 */
public class TokenManager {

    private static Map<String, String> tokenMap = new HashMap<>();
    private static Map<String, Long> tokenExpiryMap = new HashMap<>();

    // Expiry time in seconds (example: 3600s = 1 hour)
    private static final long TOKEN_VALIDITY_DURATION = 3600;

    // Base URL for your Auth endpoint
    private static final String BASE_URL = "https://your-api-domain.com";
    private static final String AUTH_ENDPOINT = "/api/login";

    /**
     * Returns token for given user role. If expired, it regenerates.
     */
    public static synchronized String getToken(String userType) {

        if (tokenMap.containsKey(userType)) {
            long issuedTime = tokenExpiryMap.get(userType);
            long currentTime = Instant.now().getEpochSecond();

            if (currentTime - issuedTime < TOKEN_VALIDITY_DURATION) {
                // Still valid
                return tokenMap.get(userType);
            }
        }

        // Generate new token if not present or expired
        String newToken = generateNewToken(userType);
        tokenMap.put(userType, newToken);
        tokenExpiryMap.put(userType, Instant.now().getEpochSecond());

        return newToken;
    }

    /**
     * Calls login API to generate a new token for each user type.
     */
    private static String generateNewToken(String userType) {

        String username = "";
        String password = "";

        switch (userType.toLowerCase()) {
            case "admin":
                username = "admin_user";
                password = "admin_pass";
                break;
            case "coordinator":
                username = "coord_user";
                password = "coord_pass";
                break;
            case "sdesk":
                username = "sdesk_user";
                password = "sdesk_pass";
                break;
            case "technician":
                username = "tech_user";
                password = "tech_pass";
                break;
            default:
                throw new RuntimeException("Invalid user type: " + userType);
        }

        // API Call for token
        Response response = RestAssured.given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .body("{ \"username\": \"" + username + "\", \"password\": \"" + password + "\" }")
                .post(AUTH_ENDPOINT)
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        // Assuming API returns token as JSON -> { "token": "abc123..." }
        return response.jsonPath().getString("token");
    }
}

// package tests;

// import io.restassured.RestAssured;
// import org.testng.annotations.Test;
// import utilities.TokenManager;

// public class GetUserDetailsTest {

//     @Test
//     public void getUserProfileAsAdmin() {
//         String token = TokenManager.getToken("admin");

//         RestAssured.given()
//                 .baseUri("https://your-api-domain.com")
//                 .header("Authorization", "Bearer " + token)
//                 .get("/api/admin/profile")
//                 .then()
//                 .statusCode(200)
//                 .log().all();
//     }

//     @Test
//     public void getUserProfileAsTechnician() {
//         String token = TokenManager.getToken("technician");

//         RestAssured.given()
//                 .baseUri("https://your-api-domain.com")
//                 .header("Authorization", "Bearer " + token)
//                 .get("/api/tech/profile")
//                 .then()
//                 .statusCode(200)
//                 .log().all();
//     }
// }

