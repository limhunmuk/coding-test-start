package coding.test.codingteststart.backjoon.textandstring;

import java.io.IOException;
import java.util.Scanner;

public class NormalPrint {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println("s = " + s);
        }
        sc.close();
    }
}
