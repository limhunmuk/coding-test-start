package coding.test.codingteststart.hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기
 */
public class AllSearchAnagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println("solution = " + solution(a, b));

    }

    public static int solution(String a, String b){
        int answer = 0;

        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();

        for(char x : b.toCharArray()){
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }

        int L=b.length()-1;
        for (int i = 0; i < L; i++) {
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt=0;
        for (int rt = L; rt < a.length(); rt++) {
            aMap.put(a.charAt(rt), aMap.getOrDefault(a.charAt(rt), 0) + 1);
            if(aMap.equals(bMap)) answer++;
            aMap.put(a.charAt(lt), aMap.get(a.charAt(lt))-1);
            if(aMap.get(a.charAt(lt)) == 0){
                aMap.remove(a.charAt(lt));
            }
            lt++;
        }

        return answer;
    }
}
