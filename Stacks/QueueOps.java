package Ch16LinkedList.Stacks;
import java.util.*;

public class QueueOps {
    public static void main(String[] args){
        String[] data = {"it", "is", "a", "wonderful", "life"};
        Queue<String> aqueue = new LinkedList<>();

        for (String str: data){
            aqueue.add(str);
        }
        System.out.println("queu = "+ aqueue);
        System.out.println(("q = " + aqueue.peek()));
        System.out.println("q = " + aqueue.size());
        while (!aqueue.isEmpty()){
            System.out.println(aqueue.remove());
        }


    }
}
