package coding.test.codingteststart.tree;

public class DFSFastSearch {

    class  Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt = rt = null;
        }
    }

    Node root;
    int DFS(int n, Node root){
        if(root.lt == null && root.rt == null){
            return n;
        }else{
            return Math.min(DFS(n+1, root.lt), DFS(n+1, root.rt));
        }
    }

    public static void main(String[] args) {
        DFSFastSearch tree = new DFSFastSearch();
        tree.root = tree.new Node(1);
        tree.root.lt = tree.new Node(2);
        tree.root.rt = tree.new Node(3);
        tree.root.lt.lt = tree.new Node(4);
        tree.root.lt.rt = tree.new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
