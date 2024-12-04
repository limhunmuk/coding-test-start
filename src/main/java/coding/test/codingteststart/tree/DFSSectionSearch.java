package coding.test.codingteststart.tree;

public class DFSSectionSearch {

    static int[] ch;
    static int n;

    public static void DFS(int L){

        if(L == n){
            for(int i=1; i<=n; i++){
                if(ch[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        }else{
            ch[L+1] = 1;
            DFS(L+1);
            ch[L+1] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {

        n = 3;
        ch = new int[n+1];

        DFS(0);


    }
}
