package coding.test.codingteststart.twopointarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DupplicateSetArray {

    public static void main(String[] args) {

        // 교집합
        /**
         * 입력
         * 4
         * 1, 3, 6, 7
         * 6
         * 2, 3, 4, 5, 7, 8
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

        List<Integer> result = solution(n, arr1, m, arr2);
        result.forEach(System.out::println);
    }

    public static List<Integer> solution(int n, int[] arr1, int m, int[] arr2){

        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m){
            if(arr1[p1] == arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
                p2++;

            }else if(arr1[p1] < arr2[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        return answer;
    }
}
