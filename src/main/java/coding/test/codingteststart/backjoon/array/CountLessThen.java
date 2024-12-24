package coding.test.codingteststart.backjoon.array;


import java.util.Scanner;

/**
 10 5
 1 10 4 9 2 3 8 5 7 6
 **/
class CountLessThen{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int criterion = sc.nextInt();
        int[] array = new int[length];

        for(int i=0; i<length; i++){
            array[i] = sc.nextInt();
        }

        StringBuilder result = new StringBuilder();
        for(int arr : array){
            if(criterion > arr) result.append(arr).append(" ");
        }

        System.out.println(result);
    }
}