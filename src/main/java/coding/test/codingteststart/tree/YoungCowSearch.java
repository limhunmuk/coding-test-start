package coding.test.codingteststart.tree;

import java.util.LinkedList;
import java.util.Queue;

public class YoungCowSearch {

    int anwer = 0;
    int [] dist = {1, -1, 5};
    int [] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                //if(x == e) return L;
                for(int d : dist){
                    int nx = x + d;
                    if(nx == e) return L+1;
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        YoungCowSearch T = new YoungCowSearch();
        //Scanner sc = new Scanner(System.in);
        //int s = sc.nextInt();
        //int e = sc.nextInt();
        System.out.println(T.BFS(5, 14));
    }

}
