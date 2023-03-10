import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        for (int i=0;i< arr.length; i++) {
            if (i==0) list.add(arr[0]);
            else {
                if (arr[i] != arr[i-1]) {
                    list.add(arr[i]);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i< answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}