package Ch16LinkedList;
import java.util.Arrays;
import java.util.*;


public class BinarySearch {
    public static void main(String[] args){
        Integer[] elements = {-5, -3, 0, 1, 3, 6, 7, 8, 10, 11, 15, 19, 25, 38, 47, 91};
        //int index = Arrays.binarySearch(elements, 19);
        int index = binarySearch(elements, 47);
        System.out.println("array size is: " + elements.length);
        System.out.println("47 is found at index " + index);
        Integer x = 7;
        Integer y = 42;
        System.out.println(x.compareTo(y));
    }

    //for primitives use < or > for comparison
    //for String objects need to use the compareTo method
    public static int binarySearch(Integer[] element, int target){
        int min = 0;
        int max = element.length -1;
        while (min <= max){
            int mid = (min+ max)/2;
            if (element[mid].compareTo(target) < 0){
            //remove the left hand side
                min = mid +1;
            } //a 2nd condition
            else if (element[mid].compareTo(target) > 0){
                max = mid -1;
              //a 3rd condition
            } else {return mid;}
        }
        //target not found
        return -1;
    }

}
