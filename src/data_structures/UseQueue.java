package data_structures;

import databases.SharedStepsDatabase;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) throws Exception{

        Queue<Object> queueNumbers = new ArrayDeque<>();

        queueNumbers.add(36);
        queueNumbers.add(23);
        queueNumbers.add(24);
        queueNumbers.add(44);
        queueNumbers.add(33);

        for (Object n : queueNumbers) {
            System.out.println(n);
        }

        queueNumbers.remove(33);

        for (Object nums : queueNumbers) {
            System.out.println(nums);
        }

        //36 gets removed
        System.out.println(queueNumbers.poll());
        System.out.println(queueNumbers);

        System.out.println(queueNumbers.peek());

        //23 gets removed
        System.out.println(queueNumbers.poll());

        // left with 24 and 44 in the queue.
        System.out.println(queueNumbers);

        Iterator<Object> queueIterator = queueNumbers.iterator();

        while (queueIterator.hasNext()) {
            System.out.println(queueIterator.next());
        }

        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        ssdb.insertQueue("Queue_Table", "queues", queueNumbers);

        String queueQuery = "SELECT * FROM Queue_Table";

        List<String> results = ssdb.executeQueryReadAllSingleColumn(queueQuery, "queues");

        //24 and 44
        for (String queueResults: results) {
            System.out.println(queueResults);
        }
    }

}
