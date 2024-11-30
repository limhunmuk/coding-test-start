package coding.test.codingteststart.bps;

import java.util.LinkedList;
import java.util.Queue;

public class NearBpsSearch {

    Node root;

    static class Node{
        int date;
        Node lt, rt;

        public Node(int data){
            this.date=data;
            lt=rt=null;
        }
    }

    public int BFS(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int length = 0;
        while (!queue.isEmpty()){
            int qLength = queue.size();
            for(int i=0; i<qLength; i++){
                Node currNode = queue.poll();
                if(currNode.lt == null && currNode.rt == null) return length; // 노트 lt,rt 가 없다는 건 최 하위 노드이다
                if(currNode.lt != null) queue.offer(currNode.lt);
                if(currNode.rt != null) queue.offer(currNode.rt);
            }
            length++;
        }
        return -1;
    }

    public static void main(String[] args) {
        NearBpsSearch tree = new NearBpsSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(" = " + tree.BFS(tree.root));

    }


}


