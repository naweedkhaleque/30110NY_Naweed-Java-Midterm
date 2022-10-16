package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) throws SQLException {

        List<Object> someWords = new ArrayList<>();

        someWords.add("These");
        someWords.add("are");
        someWords.add("some");
        someWords.add("words!");
        System.out.println(someWords);

        someWords.add("Another one");
        System.out.println(someWords);

        someWords.remove("Another one");
        System.out.println(someWords);

        for (Object words : someWords) {
            System.out.println(words);
        }

        Iterator<Object> myIterator1 = someWords.iterator();
        while (myIterator1.hasNext()) {
            System.out.println(myIterator1.next());
        }


        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        //inserting to database
        ssdb.insertList("words_for_ArrayList", "AL_column", someWords);

        //querying to database
        String Query = "SELECT * FROM words_for_ArrayList";

        //retrieving from the database
        List<String> results = ssdb.executeQueryReadAllSingleColumn(Query, "AL_column");

        for (String s: results) {
            System.out.println(s);
        }

    }

}
