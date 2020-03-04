package Ch16LinkedList.Stacks;
import java.util.*;
public class StackExample {
    public static void main(String[] args){
        String[] data = {"to", "be", "or", "not", "to", "be"};
        Stack<String> astack = new Stack<>();
        for (String str: data){
            astack.push(str);
        }
        System.out.println("Stack:" + astack);
        if (!astack.isEmpty()){
            System.out.println("Stack is empty?" + astack.isEmpty());
        }
        System.out.println("Stack size: " + astack.size());
        if (astack.peek() != "and"){
            System.out.println("Pop value: " + astack.pop());
        }

        while (!astack.isEmpty()){
            System.out.println("Pop entire stack: " + astack.pop());
        }
    }

}
