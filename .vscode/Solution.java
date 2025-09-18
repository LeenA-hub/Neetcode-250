// we done with neetcode pronlem 1 on sep 17,2025

class Solution {

  public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2 * n];

    for (int i = 0; i < n; i++) {
      ans[i] = nums[i];
      ans[i + n] = nums[i];
    }

    return ans;
  }
}

// we done with neetcode pronlem 2 on sep 18,2025
public boolean hasDuplicate(int[] nums) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1]) {
      return true;
    }
  }
  return false;
}
