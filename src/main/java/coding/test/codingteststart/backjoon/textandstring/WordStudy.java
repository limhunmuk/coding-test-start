package coding.test.codingteststart.backjoon.textandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordStudy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        StringBuilder sb = new StringBuilder(s);
        Map<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char c1 = sb.charAt(i);
            hmap.put(c1, hmap.getOrDefault(c1, 0) +1);
        }


        Integer max = Integer.MIN_VALUE;
        String maxKey = "";
        Boolean isSame = false;
        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {

            if(max < entry.getValue()){
                max = entry.getValue();
                maxKey = entry.getKey().toString();
                isSame = false;
            } else if (max.equals(entry.getValue())) {
                isSame = true;
            }
        }

        if(isSame){
            System.out.println("?");
        }else{
            System.out.println(maxKey);
        }

    }
}
