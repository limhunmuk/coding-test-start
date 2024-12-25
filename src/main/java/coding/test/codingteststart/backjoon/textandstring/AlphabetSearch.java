package coding.test.codingteststart.backjoon.textandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphabetSearch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] charInput = input.toCharArray();

        List<Integer> list = new ArrayList<>();
        //baekjoon
        // 65 - 90 - > 대문자
        // 97 - 122 - > 소문자
        for (int i = 97; i <= 122 ; i++) {

            for (int j = 0; j < charInput.length; j++) {
                char c = charInput[j];

                int i1 = i - c;
                System.out.println("print = > " + i1);

                // input 에 포함되지 않으면 -1
                    list.add(i1);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list = " + list.get(i) + " ");
        }


    }
}
