import java.util.*;

public class CharInAString {
    public static void main(String[] args) {
        //Goal Find out how many alpha characters are present in a String

        /*I could use scanner to ask users to enter a word
        then get user input, and based on what their response is I could then
        use Hash mapping to get the number of characters that occur in a string*/

        //Created scanner object to read userInput
        Scanner userInput = new Scanner(System.in);

        //Print prompt to ask user their favorite quote
        System.out.println("Please enter a word");
        String userResponse = userInput.nextLine(); //Response = "Hello" array of characters = ['H', 'e','l','l','o']
        //Captures users input

        char[] characterArray = userResponse.toCharArray(); //this converts my string into an array of characters.

        Map<Character, Integer> map = new LinkedHashMap<>(); //Maintains the order of the elements
        //[' ', a', 'b','a','l','o']
        for (char character: characterArray) {
            if  (character == ' ') {
                continue; //skips the rest of the code
            }
            int value = map.getOrDefault(character, 0) + 1;
            map.put(character,value);
        }
        System.out.println("Your word has:");
        for (char character: map.keySet()) {
            System.out.println(character + ": " + map.get(character));
        }
    }
}
