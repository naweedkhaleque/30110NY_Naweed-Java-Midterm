package string_problems;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here

        st = st.toLowerCase();

        String[] splitString = st.split(" ");
        int totalWords = splitString.length;

        for (int i = 0; i < totalWords; i++) {
            int countDuplicates = 1;

            for (int j = i + 1; j < totalWords; j++) {
                if (splitString[i].equals(splitString[j])) {
                    countDuplicates++;
                    splitString[j] = "marked";
                }
            }
            if (countDuplicates > 1 && !splitString[i].equals("marked")) {
                System.out.println(splitString[i] + ": "+ countDuplicates);
            }
        }
        String sentenceWithoutSpaces = st.replace(" ", "");
        int numOfChars = sentenceWithoutSpaces.length();
        System.out.println("The average length of all the words is: " + numOfChars / totalWords);
    }

}
