package coding.test.codingteststart.dfs;

public class jeagiCall {

    public void DFS(int n){
        if(n == 0) return;
        else{

            DFS(n-1);
            System.out.print(n + " ");

        }
    }

    public static void main(String[] args) {

        jeagiCall T = new jeagiCall();
        T.DFS(3);

    }


}
