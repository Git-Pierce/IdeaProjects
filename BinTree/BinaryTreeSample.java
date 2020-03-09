package Ch16LinkedList.BinTree;
import Ch16LinkedList.BinTree.IntTreeNode;

public class BinaryTreeSample {
    public static void main(String[] args){
        int max = 10;
        IntTreeNode t = new IntTreeNode(max);
        t.insert(5);
        t.insert(15);
        t.insert(8);
        t.insert(3);
        System.out.print("In Order: ");
        t.printInOrder();
        System.out.print("Pre Order: ");
        t.printPreOrder();
        System.out.print("Post Order: ");
        t.printPostOrder();
//        for (int i=1; i<=10; i++){
//            IntTree t = new IntTree(i);
//            t.print();
//            List<Integer> result = t.inorderList();
//            System.out.println("List= " + result);
//        }
    }
}
