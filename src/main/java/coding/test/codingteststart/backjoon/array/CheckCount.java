package coding.test.codingteststart.backjoon.array;



import java.util.Scanner;

public class CheckCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        int chkNum = sc.nextInt();
        int size = 0;
        for(int a : arr){
            if(chkNum == a){
                size++;
            }
        }

        System.out.println(size);

    }
}