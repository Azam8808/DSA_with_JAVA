class BinaryTreeB{
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int Node[]) {
            idx++;
            if(Node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(Node[idx]);
            newNode.left = buildTree(Node);
            newNode.right = buildTree(Node);
            return newNode;
        }

        //preOrder structure
        public static void preOrder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //Inorder Structure
        public static void inOrder(Node root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        //PostOrder Structure
        public static void postOrder(Node root){
            if(root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    
    }


    public static void main(String args[]) {
        int Node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(Node);
        // tree.preOrder(root);
        //tree.inOrder(root);
        tree.postOrder(root);
        // System.out.println(root.data);


    }
}