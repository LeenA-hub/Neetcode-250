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
  // apperteny it didnt accepted my solution even though it passed the cases

  public boolean hasDuplicate2(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }
    return false;
  }

  // we doing neetcode problem 3 on sep 19,2025
  // two string s and t, return true if the two strings are anagrams of each
  // other, otherwise return false.
  public boolean isAnagram(String s, String t) {
    class Solution {
      public boolean isAnagram(String s, String t) {
        for (int i = 0; i <= s.length; i++) {
          for (int j = 0; j <= t.length; j++) {
            if (s[i] != t[j]) {
              return false;
            }

          }
        }
      }
    }

  }

  // we doing problem 4 on sep 20,2025
  // two sum problem
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {

        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };

        }

      }
      return new int[] {};
    }
  }

  // problem 5 on sep 22,2025
  // best time to buy and sell stock
  public int maxProfit(int[] prices) {

  }

  // problem 6 on Oct 2,2025
  // product of array except self
  public int[] productExceptSelf(int[] nums) {
    int[] newnums = nums;
    for (int i = 0; i <= nums.length; i++) {
      switch (i) {
        case 1:
          nums[0] = nums[1] * nums[2] * nums[3] * nums[i + 1];
          return newnums;
        case 2:
          nums[1] = nums[0] * nums[2] * nums[3] * nums[i + 1];
          return newnums;
        case 3:
          nums[2] = nums[0] * nums[1] * nums[3] * nums[i + 1];
          return newnums;
        case 4:
          nums[3] = nums[0] * nums[2] * nums[1] * nums[i + 1];
          return newnums;
        case 5:
          nums[i + 1] = nums[0] * nums[2] * nums[3] * nums[1];
          return newnums;
      }
    }
    return newnums;
  }
}
