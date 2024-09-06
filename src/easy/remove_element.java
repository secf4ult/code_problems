package easy;

public class remove_element {
    public int removeElement(int[] nums, int val) {
        int srcIndex = 0;
        int tgtIndex = 0;
        while (srcIndex < nums.length) {
            if (nums[srcIndex] != val) {
                nums[tgtIndex] = nums[srcIndex];

                tgtIndex++;
            }
            srcIndex++;
        }

        return tgtIndex;
    }

    public static void main(String[] args) {
        remove_element solution = new remove_element();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int result = solution.removeElement(nums, val);
        // print nums elements
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
    }
}