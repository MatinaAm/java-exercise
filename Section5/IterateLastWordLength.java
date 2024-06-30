package Section5;

public class IterateLastWordLength {


        public static void main(String[] args) {
            String sentence = "This is an example sentence";
            int length = lengthOfLastWord(sentence);
            System.out.println("Length of the last word: " + length);
        }

        public static int lengthOfLastWord(String s) {
            int length = 0;
            boolean foundChar = false;

            // Iterate from the end of the string to the beginning
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);

                // Check if the character is a space
                if (ch == ' ') {
                    // If we've already found some characters, we're done
                    if (foundChar) {
                        break;
                    }
                } else {
                    // If the character is not a space, increment the length counter
                    length++;
                    foundChar = true;
                }
            }

            return length;
        }
    }


