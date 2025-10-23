
/**
 * This program demonstrates how to search for the substring "Hello"
 * within each string of an array and report its location.
 * It uses TypeScript's type annotation for the string array.
 */
class HelloSearch {

    public static main(): void {
        // The array of strings to be searched, with a type annotation.
        const words: string[] = ["HelloIndia", "World is great", "HelloTask", "HelloDelhi", "HelloMumbai", "Pune"];

        console.log("Searching for 'Hello' in the array...\n");

        // Use a loop to iterate through each element of the array.
        for (let i = 0; i < words.length; i++) {
            // The `includes()` method is a modern alternative to `contains()` in JavaScript/TypeScript.
            // It checks if a substring exists within a string.
            if (words[i].includes("Hello")) {
                console.log(" Hello is found at index: " + i);
            } else {
                console.log(" Hello is notfound at index: " + i);
            }
        }

        console.log("\nSearch complete.");
    }
}

// Call the main method to run the program.
HelloSearch.main();
