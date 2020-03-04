package Ch16LinkedList.Stacks;

import java.util.*;

public class QueueExample {
    public static void main(String[] args){
        String[] data = {"this", "is", "a", "test", "only"};
        Queue<String> aq = new LinkedList<>();

        for (String astring: data){
            aq.add(astring);
        }

        System.out.println("Queue contents: " + aq);
        System.out.println("Q size: " + aq.size());
        if (!aq.isEmpty()){
            System.out.println("Empty Queue? " + aq.isEmpty());
        }
        while (!aq.isEmpty()){
            System.out.println("Queue removes: " + aq.remove());
        }
    }
}
