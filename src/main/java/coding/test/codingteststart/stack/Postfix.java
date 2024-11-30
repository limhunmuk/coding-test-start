package coding.test.codingteststart.stack;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public static void main(String[] args) {
        //String str = "352+*9-";

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("solution = " + solution(str));
    }

    public static int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c - '0');
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt + rt);
                else if(c == '-') stack.push(lt - rt);
                else if(c == '*') stack.push(lt * rt);
                else if(c == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }
}
