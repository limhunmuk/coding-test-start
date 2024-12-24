package coding.test.codingteststart.backjoon.textandstring;

import java.util.Scanner;

public class SearchWordPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int pos = sc.nextInt()-1;
        char[] arrWord = word.toCharArray();
        String result = "";
        for (int i = 0; i < arrWord.length; i++) {
            if(i == pos){
                result = String.valueOf(arrWord[pos]);
            }
        }
        System.out.println(result);
    }
}
