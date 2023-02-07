package Priority;

import java.util.*;

//Usage concern 
public class Main {
    public static void main(String[] args) {
        StuArr obj = new StuArr();
        Queue q = obj.getqueue();
        obj.addEle(q);

        // Printing all the elements
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
