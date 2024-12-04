package coding.test.codingteststart.tree;

import java.util.Scanner;

public class DFSNearSearch {
    static int n, m, anInt = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v){
        if(v == n){
            anInt++;
        }else{
            for(int i=1; i<=n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        DFSNearSearch T = new DFSNearSearch();
        T.DFS(1);
        System.out.println(anInt);


    }
}
