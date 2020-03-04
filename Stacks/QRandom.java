package Ch16LinkedList.Stacks;
import java.util.*;

public class QRandom {
    public static void main(String[] args){
        Queue<Integer> bqueue = new LinkedList<>();
        bqueue = createRandomQ(1000);
        System.out.println(bqueue);
    }
    public static Queue<Integer> createRandomQ(int size){
        Queue<Integer> aqueue = new LinkedList<>();
        Random r = new Random();
        for (int i = 1; i < 10; i++){
            aqueue.add(r.nextInt(size));
        }
        return aqueue;
    }
}
