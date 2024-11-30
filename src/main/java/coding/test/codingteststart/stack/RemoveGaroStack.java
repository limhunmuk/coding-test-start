package coding.test.codingteststart.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveGaroStack {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println("solution = " + solution(str));
        }

        public static String solution(String str){
            String answer = "YES";
            Stack<Character> stack = new Stack<>();
            for(char c : str.toCharArray()){
                if(c == ')'){
                    Character pop = stack.pop();
                    System.out.println("pop = " + pop);
                    while(stack.pop() != '(');
                }else{
                    stack.push(c);
                }
            }

            for(int i=0 ; i<stack.size(); i++){
                answer += stack.get(i);
            }
            return answer;
        }
}
