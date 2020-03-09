package Ch16LinkedList.BinTree;

import Ch16LinkedList.BinTree.IntTreeNode;

import java.util.*;
// a node in a binary tree

public class IntTree {
    private IntTreeNode overallRoot;

    public List<Integer> inorderList(){
        List<Integer> result = new ArrayList<Integer>();
        inorderList(overallRoot, result);
        return result;
    }
    private void inorderList(IntTreeNode root,List<Integer> list){
        if (root!=null){
            inorderList(root.left, list);
            list.add(root.data);
            inorderList(root.right, list);
        }
    }
    // pre: max >0
    //post: constructs a sequential tree with given number of nodes
    public IntTree(int max){
        if (max < 0){
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }
    // post: returns a sequential tree with n as its root
    // unless n > max, in which case it returns an empty tree
    private IntTreeNode buildTree(int n, int max){
        if (n > max){
            return null;
        } else {
            return new IntTreeNode(n, buildTree(n,max), buildTree(2*n, max));
        }
    }
    public void printInorder(IntTreeNode root){
        if (root != null){
            printInorder(root.left);
            System.out.println(" " + root.data);
            printInorder(root.right);
        }
    }

    public void print(){
        print(overallRoot);
        System.out.println();
    }
    private void print(IntTreeNode root){
        //recursive base case do nothing
        if (root != null){
            //recursive case print left, center, right
            print(overallRoot.left);
            System.out.println(overallRoot);
            print(overallRoot.right);

        }
    }
}
