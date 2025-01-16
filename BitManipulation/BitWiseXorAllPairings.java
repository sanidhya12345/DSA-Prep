public class BitWiseXorAllPairings {
  public static int xorAllNums(int[] nums1, int[] nums2) {
    int firstXor = 0;
    int secondXor = 0;
    // total xor of nums1
    for (int i : nums1) {
      firstXor = firstXor ^ i;
    }
    // total xor of nums2
    for (int i : nums2) {
      secondXor = secondXor ^ i;
    }
    int n1 = nums1.length;
    int n2 = nums2.length;
    if (n1 % 2 != 0 && n2 % 2 == 0) {
      return secondXor;
    } else if (n1 % 2 != 0 && n2 % 2 != 0) {
      return firstXor ^ secondXor;
    } else if (n1 % 2 == 0 && n2 % 2 != 0) {
      return firstXor;
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] nums1 = { 2, 1, 3 };
    int[] nums2 = { 10, 2, 5, 0 };
    System.out.println(xorAllNums(nums1, nums2));
  }
}
