package Ch16LinkedList.Stacks;
import java.util.*;

public class StackOps {
    public static void main(String[] args){
        String[] data = {"it", "is", "a", "wonderful", "day"};
        Stack<String> astack = new Stack<>();

        for(String str : data){
            astack.push(str);
        }
        System.out.println("stack= " + astack);
        System.out.println("stack size = " + astack.size());
        System.out.println(("stack peek = " + astack.peek()));
        while (!astack.isEmpty()){
            //astack.pop();
            System.out.println(astack.pop());

        }
    }


}
