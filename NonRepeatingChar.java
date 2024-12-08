import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {

        String string = "abracadabra";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            if (map.containsKey(character)==false) {
                map.put(character,1);
            }else {
                int charCount = map.get(character);
                map.put(character,charCount+1);
            }
        }
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            int charCount = map.get(character);

            if (charCount == 1){
                System.out.println("The first non-repeating character is: " + character);
                break;
            }
        }
    }
    }
