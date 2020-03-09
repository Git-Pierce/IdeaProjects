package Ch16LinkedList.BinTree;

public class IntTreeNode {

        public int data;
        public IntTreeNode left;
        public IntTreeNode right;
        //constructs leaf node
        public IntTreeNode(int data){
            this.data = data;
        }
        //constructs branch node with data and links
        public IntTreeNode(int data, IntTreeNode left, IntTreeNode right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public void insert(int value){// insert in binary order
            if (value <= data){
                if (left == null){
                    left = new IntTreeNode(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null){
                    right = new IntTreeNode(value);
                } else {
                    right.insert(value);
                }
            }
        }
        public void printInOrder(){ //print in order
            if (left !=null){
                left.printInOrder();
            }
            System.out.println(data);
            if (right != null){
                right.printInOrder();
            }
        }
        public void printPreOrder(){ //print in order

            System.out.println(data);
            if (left !=null){
                left.printInOrder();
            }

            if (right != null){
                right.printInOrder();
            }
        }
        public void printPostOrder(){ //print in order


            if (left !=null){
                left.printInOrder();
            }

            if (right != null){
                right.printInOrder();
            }
            System.out.println(data);
        }
    }

