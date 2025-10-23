package packages.base;

import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.AssertParameter;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Write;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;

import org.apiguardian.api.API;
import org.json.JSONObject;
// import org.json.JSONPObject;


public class ApiTest {

    @Test
    public void getrefdatacustAsset() {
        // Define the base URI for the API
        String baseUrl = "https://fsmqa-api-service.azurewebsites.net";
        String endpoint = "/rest/b/asset/9c44877a-226f-479d-8936-dbbef4ca0ba9";
        String queryParameterName = "serial";
        String queryParameterValue = "029343550";

     Response response = RestAssured.given()
                .baseUri(baseUrl)
                .basePath(endpoint)
                .queryParam(queryParameterName, queryParameterValue)
                .get();

        // स्थिति कोड (status code) को सीधे सत्यापित करें
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "Expected status code 200 but got " + statusCode);
        System.out.println("Statuscode verified");

        // प्रतिक्रिया बॉडी को कंसोल पर प्रिंट करें
        String responseBody = response.getBody().asString();
        String extractedSerial=response.getBody().jsonPath().getString("SerialNumber");
        System.out.println("Response Body:\n" + responseBody);
        Assert.assertEquals(extractedSerial, queryParameterValue,"Serial number not matched");
        System.out.println("Serial number verified");

    }
}

                            
