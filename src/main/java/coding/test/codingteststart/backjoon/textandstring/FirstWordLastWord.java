package coding.test.codingteststart.backjoon.textandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstWordLastWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cnt = br.readLine();
        for(int i=0; i<Integer.parseInt(cnt); i++){
            String word = br.readLine();
            System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1));
        }
        br.close();
    }
}
