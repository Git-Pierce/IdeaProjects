package Search;

public class BinSearch {
    public static void main(String[] args){
        Integer[] elements = {-5, -3, 0, 1, 3, 6, 7, 8, 10, 11, 15, 19, 25, 38, 47, 91};
        //int index = Arrays.binarySearch(elements, 19);
        int index = binarySearch(elements, 47);
        System.out.println("array size is: " + elements.length);
        System.out.println("47 is found at index " + index);
        Integer x = 7;
        Integer y = 42;
        System.out.println("Compare x=7 to y=42:  " + x.compareTo(y));
    }
    public static int binarySearch(Integer[] a, int target){
        return binarySearch(a, target, 0, a.length-1);
    }

    private static int binarySearch(Integer[] a, int target, int min, int max){
        if (min > max){  // pointers cross each other
            return -1;   // not found
        } else {
            int mid = (min + max)/2;
            if (a[mid] < target){ //go right
                return binarySearch(a, target, mid+1, max);
            } else if (a[mid] > target){ // go left
                return binarySearch(a, target, min, mid-1);
            } else {
                return mid; //target found
            }

        }
    }
}
