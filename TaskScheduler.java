//Time Complexity O(1) sorting is also done on array of size 26
//Space Complexity O(1)
//Leetcode tested

import java.util.Arrays;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] charMap = new int[26];
        for (char c : tasks) {
            charMap[c - 'A']++;
        }
        Arrays.sort(charMap);
        int max_value = charMap[25] - 1;
        int idle_slot = max_value * n;

        for (int i = 24; i >=0 ; i--) {
            idle_slot -= Math.min(charMap[i],max_value);
        }

        return idle_slot > 0 ? idle_slot + tasks.length : tasks.length;
    }
}
