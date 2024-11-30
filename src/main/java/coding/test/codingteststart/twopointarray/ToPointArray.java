package coding.test.codingteststart.twopointarray;

import java.util.Scanner;

public class ToPointArray {

    public static void main(String[] args) {

        // 정렬된 두 배열 합치기
        /**
         * 입력
         * 4
         * 1, 3, 6, 7
         * 5
         * 2, 3, 4, 5, 8
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = scanner.nextInt();
        }

        int[] sortArr = solution(n, arr1, m, arr2);

        for(int i=0; i<n+m; i++){
            System.out.print(sortArr[i] + " ");
        }
    }

    public static int[] solution(int n, int[] arr1, int m, int[] arr2){

        int[] answer = new int[n+m];

        int p1 = 0, p2 = 0, p3 = 0;
        while(p1 < n && p2 < m){
            if(arr1[p1] < arr2[p2]){
                answer[p3++] = arr1[p1++];
            }else{
                answer[p3++] = arr2[p2++];
            }
        }

        while(p1 < n){
            answer[p3++] = arr1[p1++];
        }
        while(p2 < m){
            answer[p3++] = arr2[p2++];
        }


        return answer;
    }
}
