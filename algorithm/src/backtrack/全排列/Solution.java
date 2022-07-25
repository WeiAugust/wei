package backtrack.全排列;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/21 9:04
 * @Version 1.0
 **/
public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, track);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            track.add(nums[i]);
            backtrack(nums, used, track);
            track.removeLast();
            used[i] = false;
        }
    }
}
