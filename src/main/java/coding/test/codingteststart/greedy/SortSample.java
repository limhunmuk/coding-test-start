package coding.test.codingteststart.greedy;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;

@Data
public class SortSample implements Comparable<SortSample> {

    public SortSample(int cost){
        this.cost = cost;
    }

    int cost ;
    @Override
    public int compareTo(SortSample o) {
        return this.cost - o.cost;
    }

    public static void main(String[] args) {

        ArrayList<SortSample> test = new ArrayList<>();
        for (int i=10; i>1; i--) {
            test.add(new SortSample(i));
        }

        Collections.sort(test);
        System.out.println("test = " + test);
    }
}
