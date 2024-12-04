package coding.test.codingteststart.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSFastSearch {

        class Node{
            int data;
            Node lt, rt;
            public Node(int val){
                data = val;
                lt = rt = null;
            }
        }

        Node root;
        int BFS(Node root){
            int L = 0;
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            while(!Q.isEmpty()){
                int len = Q.size();
                for(int i=0; i<len; i++){
                    Node cur = Q.poll();
                    if(cur.lt == null && cur.rt == null){
                        return L;
                    }
                    if(cur.lt != null) Q.offer(cur.lt);
                    if(cur.rt != null) Q.offer(cur.rt);
                }
                L++;
            }
            return 0;
        }

        public static void main(String[] args) {
            BFSFastSearch tree = new BFSFastSearch();
            tree.root = tree.new Node(1);
            tree.root.lt = tree.new Node(2);
            tree.root.rt = tree.new Node(3);
            tree.root.lt.lt = tree.new Node(4);
            tree.root.lt.rt = tree.new Node(5);
            System.out.println(tree.BFS(tree.root));
        }
}
