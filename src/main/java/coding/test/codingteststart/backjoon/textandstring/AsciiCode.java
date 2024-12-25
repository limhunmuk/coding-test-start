package coding.test.codingteststart.backjoon.textandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiCode {
    private static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = br.readLine();
        for (int i = 0; i < Integer.parseInt(s); i++) {
            String f = s1.substring(i, i + 1);
            sum += Integer.parseInt(f);
        }

        System.out.println(sum);
    }
}
