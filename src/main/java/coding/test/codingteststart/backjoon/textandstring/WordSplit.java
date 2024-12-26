package coding.test.codingteststart.backjoon.textandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordSplit {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = null;
        try {
            text = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringTokenizer st = new StringTokenizer(text, " ");
        System.out.println(st.countTokens());
    }
}
