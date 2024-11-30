package coding.test.codingteststart.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ThreeBoxMoveTest {

    /**
        * 3개의 상자를 이동시키는데, 이동시키는데 드는 비용을 최소화 하려고 한다.
        상자를 이동시킬 때는 상자를 이동시키는데 드는 비용은 상자의 무게와 같다.
        상자를 이동시키는데 드는 비용을 최소화 하려면 어떻게 상자를 이동시켜야 할까요?

        상자의 무게가 주어지면 상자를 이동시키는데 드는 비용을 최소화 하는 프로그램을 작성하세요.

        입력
     5
     10 13 10 12 15
     12 39 30 23 11
     11 25 50 53 15
     19 27 29 37 27
     19 13 30 13 19

     */
        @Test
        @DisplayName("")
        void testCase1(){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(solution(n, k, arr));
        }

        public int solution(int n, int k, int[] box){
            int answer = 0;
            int sum = 0;
            for(int i = 0; i < k; i++){
                sum += box[i];
            }
            answer = sum;
            for(int i = k; i < n; i++){
                sum += (box[i] - box[i-k]);
                answer = Math.max(answer, sum);
            }
            return answer;
        }
}
