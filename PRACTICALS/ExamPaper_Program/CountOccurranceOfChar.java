// public class CountOccurranceOfChar {
//     public static void main(String[] args) {
//         if (args.length > 0) {
//             String input = args[0];
//             int len = input.length();
//             int[] cntArray = new int[len];
//             boolean[] checked = new boolean[len];

//             System.out.println("String: " + input);

//             for (int i = 0; i < len; i++) {
//                 if (!checked[i]) {
//                     char checkChar = input.charAt(i);
//                     int count = 1; // Start count at 1 to include the current character
//                     for (int j = i + 1; j < len; j++) {
//                         if (checkChar == input.charAt(j)) {
//                             count++;
//                             checked[j] = true; // Mark this character as counted
//                         }
//                     }
//                     cntArray[i] = count;
//                 }
//             }

//             // Print the counts for each character
//             for (int i = 0; i < len; i++) {
//                 if (cntArray[i] > 0) {
//                     System.out.println("Character '" + input.charAt(i) + "' occurs " + cntArray[i] + " times.");
//                 }
//             }
//         } else {
//             System.out.println("No input string provided.");
//         }
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class CountOccurranceOfChar {
    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Count occurrences of each character
            for (char ch : input.toCharArray()) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }

            // Print the counts for each character
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
            }
        } else {
            System.out.println("No input string provided.");
        }
    }
}
