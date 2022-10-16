package data_structures;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    /** INSTRUCTIONS
     *
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        //fixed file path
        String textFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "data_structures" + File.separator + "data" + File.separator + "self-driving-car";

        //create new file
        File file = new File(textFilePath);

        //try-catch with exceptions and BufferedReader
        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)){

            String line;

            LinkedList<String> myLinkedList = new LinkedList<>();
            Stack<String> myStack = new Stack<>();

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] splitSentence = line.split(" ");
                myLinkedList.add(Arrays.toString(splitSentence));
                myStack.add(Arrays.toString(splitSentence));
            }

            Iterator<String> LinkedListIterator = myLinkedList.iterator();
            while (LinkedListIterator.hasNext()) {
                System.out.println(LinkedListIterator.next());
            }

            Iterator<String> StackIterator = myStack.iterator();
            while (StackIterator.hasNext()) {
                System.out.println(StackIterator.next());
            }

            myStack.add("Some Text added with Stack");
            myStack.add("Another text");
            myStack.remove("Some Text added with Stack");

            for (String string : myStack) {
                System.out.println(string);
            }
            myStack.pop();
            myStack.push("something to push");

            for (String string : myStack) {
                System.out.println(string);
            }


        } catch (FileNotFoundException e) {
            System.out.println("NO FILE EXISTS AT THE PROVIDED PATH!");
        } catch (IOException e) {
            System.out.println("COULD NOT READ FROM FILE. PLEASE CHECK YOUR FILE IS NOT CORRUPTED");
        }
    }
}


