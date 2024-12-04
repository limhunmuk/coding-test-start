package coding.test.codingteststart.tree;

import java.util.Queue;

/**
 * BFS 기본 탐색
 * 루트부터 레벨을 증가시키면서 탐색
 */
public class BFSBasicSearch {

    Node root;
    void BFS(Node root){
        Queue<Node> Q = new java.util.LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " > ");
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {

        BFSBasicSearch tree = new BFSBasicSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);

    }
}


class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}
