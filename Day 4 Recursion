import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> finalAns = new ArrayList<>();

    public void helper(int[] nums, int index, List<Integer> combinationFormedSoFar) {
        if (index == nums.length) {
            finalAns.add(new ArrayList<>(combinationFormedSoFar)); // Add a copy of combinationFormedSoFar to finalAns
            return;
        }
        helper(nums, index + 1, combinationFormedSoFar);
        combinationFormedSoFar.add(nums[index]);
        helper(nums, index + 1, combinationFormedSoFar);
        combinationFormedSoFar.remove(combinationFormedSoFar.size() - 1); // Backtrack
    }

    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return finalAns;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
