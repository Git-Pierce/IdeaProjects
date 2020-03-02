package Search;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;

public class Search {
    public static void main(String args []){
        //ArrayList<Integer> elements = new ArrayList<Integer>();
        Integer[] elements = {-5, -3, 0, 1, 3, 6, 7, 8, 10, 11, 15, 19, 25, 38, 47, 91};
        Integer[] element3 = {1, 10, 20};
        binarySearch(elements, 0);
        System.out.println("Index found:" + binarySearch(elements, 42));
        System.out.println("Index found:" + binarySearch(elements, 0, 5, 0));


        Integer[] element2 = copyOf(elements, 5);
        for (int i = 0; i < element2.length; i++) {
            System.out.println("element2: " + element2[i]);
        }

//        String anArrayString = element2.toString();  //converting array to string
//        System.out.println("Array string: " + anArrayString);

//        for (int x: element2){
//            System.out.println("for each element2: " + element2[i]);
//        }

        Arrays.sort(element3);
        for (int x=0; x < element3.length; x++) {
            System.out.println("sorted element3: " + element3[x]);
        }
        //System.out.println("Equal to:" +Arrays.equals(element2, elements));
        Arrays.fill(element3, 0);
        for (int i1=0; i1 < element3.length; i1++){
            System.out.println("element3: " + element3[i1]);
       }

        //transfer array into list and sort and print it!
        Integer[] intArray = {100, 0, 20, -1};
        List<Integer> intList = new ArrayList<>();
        for (Integer num: intArray){
            intList.add(num);
        }
        System.out.println("Before:" + intList);
        Collections.sort(intList);
        System.out.println("After:" + intList);
        }
    }

