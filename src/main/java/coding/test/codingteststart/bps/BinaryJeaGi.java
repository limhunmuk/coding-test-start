package coding.test.codingteststart.bps;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryJeaGi {

    public static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt = rt = null;
        }
    }

    public  void BPS(Node node){

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int deepSize = 0;
        while(!queue.isEmpty()){
            int qSize=queue.size();
            System.out.println("deep size   : " + deepSize);
            for (int i=0; i<qSize; i++){
                Node current = queue.poll();
                System.out.print(current.data + " ");
                if(current.lt!=null) queue.offer(current.lt);
                if(current.rt!=null) queue.offer(current.rt);
            }
            deepSize++;
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {

        BinaryJeaGi T = new BinaryJeaGi();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        T.BPS(root);

    }
}
