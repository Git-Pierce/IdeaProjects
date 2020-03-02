package Ch16LinkedList;

public class LLTraversal {
    public static void main(String[] args){
        int[] data = {3,1,2,3,1,2,3,1,2,3};
        LLIntList list = new LLIntList();
        //Process empty list
//        System.out.println("Empty list...");
//        list.removeAt(3);
//        System.out.println(list);

        //Copy array into LL
        for (int n: data){
            list.add(n);
        }

//        System.out.println("Testing value removal...");
//        for (int i=0; i < list.size(); i++) {
//            System.out.println("Before removal list: " + list);
//            list.removeAt(3);
//            System.out.println("After removal list: " + list);
//        }

        //exits as soon as no value1 are found
        System.out.println("Testing value removal...");

        while (list.removeAt1(3)){
            System.out.println("Before removal list: " + list);
            System.out.println("Index of 3:" +list.indexOf(3));
            list.removeAt(3);
            System.out.println("After removal list: " + list);
        }
        System.out.println("FINAL List contents: " + list);

    }
}
