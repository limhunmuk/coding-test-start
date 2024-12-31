package coding.test.codingteststart.backjoon.textandstring;

import java.util.HashMap;
import java.util.Scanner;

public class WordStudy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        String input = sc.nextLine();

        // 대소문자 구분 없애기 (모두 대문자로 변환)
        String word = input.toUpperCase();

        // 빈도 저장용 HashMap
        HashMap<Character, Integer> hmap = new HashMap<>();

        // 각 문자의 빈도를 계산
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) { // 알파벳만 처리
                hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
            }
        }

        // 최대 빈도 및 해당 문자 찾기
        char mostFrequentChar = '?';
        int maxFrequency = 0;
        boolean isTie = false;

        for (char ch : hmap.keySet()) {
            int frequency = hmap.get(ch);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentChar = ch;
                isTie = false; // 새로운 최대값이 등장하면 동점 아님
            } else if (frequency == maxFrequency) {
                isTie = true; // 동점 상태
            }
        }

        // 결과 출력
        if (isTie) {
            System.out.println("?");
        } else {
            System.out.println(mostFrequentChar);
        }
    }
}