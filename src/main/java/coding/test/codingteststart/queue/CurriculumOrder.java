package coding.test.codingteststart.queue;

import java.util.Queue;
import java.util.Scanner;

public class CurriculumOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();
        System.out.println("solution = " + solution(need, plan));

    }

    public static String solution(String need, String plan){
        String answer = "YES";

        Queue<Character> Q = new java.util.LinkedList<>();
        for(char c : need.toCharArray()) Q.offer(c); // need를 Q에 넣는다.
        for(char c : plan.toCharArray()){
            if(Q.contains(c)){ // plan의 문자가 Q에 포함되어 있으면
                if(c != Q.poll()){ // Q에서 빼낸 문자가 plan의 문자와 다르면
                    return "NO"; // NO를 리턴한다.
                }
            }
        }
        if(!Q.isEmpty()){ // Q가 비어있지 않으면
            return "NO"; // NO를 리턴한다.
        }
        return answer;
    }
}
