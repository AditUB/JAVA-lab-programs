package Priority;

import java.util.*;

//Object creation concern
public class StuArr {

    // Create priority queue
    public Queue getqueue() {
        Queue q = new PriorityQueue();
        return q;
    }

    // adding elements to queue
    public Queue addEle(Queue q) {
        Student S[] = new Student[5];
        S[0] = new Student(1, "A");
        S[1] = new Student(2, "B");
        S[2] = new Student(3, "c");
        S[3] = new Student(4, "d");
        S[4] = new Student(5, "e");

        q.add(S[2]);
        q.add(S[3]);
        q.add(S[0]);
        q.add(S[4]);
        q.add(S[1]);

        return q;
    }
}
