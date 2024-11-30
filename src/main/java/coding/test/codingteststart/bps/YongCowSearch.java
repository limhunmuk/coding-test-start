package coding.test.codingteststart.bps;

import java.util.LinkedList;
import java.util.Queue;

public class YongCowSearch {

    int[] step = {1, -1, 5};

    int[] position;
    Queue<Integer> stepQueue = new LinkedList<>();
    public int BFS(int myPosition, int cowPosition) {
        position = new int[10001];
        position[myPosition]=1;
        stepQueue.offer(myPosition);
        int level = 0;
        while(!stepQueue.isEmpty()){
            int stepSize = stepQueue.size();
            for (int i = 0; i< stepSize; i++){
                int currStep = stepQueue.poll();
                if(currStep == cowPosition) // 송아지 좌표 찍었으면 끝 !
                    return level;
                for(int j=0; j<3; j++){
                    int nextMoveStep = currStep + step[j]; // 현재 스텝에다가 세가지 이동좌표를 더해야지
                    // 주어진 좌표안에서의 STEP이면서 step[nextMoveStep] == 0 -> 체크안된 실행된적 없는 좌표
                    if(nextMoveStep >= 1 && nextMoveStep <= 10000 && position[nextMoveStep] == 0) {
                        position[nextMoveStep] = 1; // 이동좌표 표시 -> 발자국
                        stepQueue.offer(nextMoveStep);  // 트리노트 이동하면서 이동한곳 표시
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        YongCowSearch yongCowSearch = new YongCowSearch();
        int myPosition = 5;
        int cowPosition = 14;
        System.out.println("cowPosition = " + yongCowSearch.BFS(myPosition, cowPosition));
    }
}
