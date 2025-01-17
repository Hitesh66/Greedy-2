//Time Complexity O(N Log N)
//Space Complexity O(1)
//Leetcode tested

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });

        List<int[]> res = new ArrayList<>();

        for (int[] p:people) {
            res.add(p[1],p);
        }
        int n = people.length;

        return res.toArray(new int[n][2]);
    }
}
