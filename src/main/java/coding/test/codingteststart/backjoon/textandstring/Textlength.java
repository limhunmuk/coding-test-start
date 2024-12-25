package coding.test.codingteststart.backjoon.textandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Textlength {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(">> " + br.readLine().length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
