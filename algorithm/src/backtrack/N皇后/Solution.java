package backtrack.N皇后;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/21 21:25
 * @Version 1.0
 **/
public class Solution {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueues(int n) {
        List<String> track = new ArrayList<>(n);
        backtrack(track, 0, n);
        return res;
    }

    private void backtrack(List<String> track, int row, int size) {
        if (track.size() == row) {
            res.add(new ArrayList<>(track));
            return;
        }
        int n = track.get(row).length();
        for (int i = 0; i < n; i++) {
            if (!isValid(size, row, i)) {
                track.add(".");
            } else {
                track.add("Q");
            }
            backtrack(track, row + 1, size);
        }
    }

    private boolean isValid(int n, int row, int col) {
        for (int i = 0; i <= row; i++) {
            if (res.get(i).get(col).equals("Q")) {
                return false;
            }
        }
        if (row > 0 && col > 0 && row < n - 1 && col < n - 1) {
            if ((res.get(row - 1).get(col - 1).equals("Q")) ||
            (res.get(row - 1).get(col + 1).equals("Q"))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> res = solution.solveNQueues(4);
        res.forEach(System.out::println);
    }
}
