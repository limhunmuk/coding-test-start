package coding.test.codingteststart.stack;

import java.util.Scanner;
import java.util.Stack;

public class GaroBiGyeo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("solution = " + solution(str));
    }

    public static String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            //System.out.println("c = " + c);
            if(c == '(') stack.push(c);
            else{
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }

        return answer;
    }
}
