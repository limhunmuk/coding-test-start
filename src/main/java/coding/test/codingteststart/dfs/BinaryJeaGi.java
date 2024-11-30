package coding.test.codingteststart.dfs;

public class BinaryJeaGi {

    public void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {

            BinaryJeaGi T = new BinaryJeaGi();
            T.DFS(11);
    }
}
