package LeetCodeJavaPractice;

public class SingleElement {
	
	public int singleNonDuplicate(int[] nums) {
		int single = nums[0];
		for (int i = 0 ; i < nums.length; i+=2) {
			if (i == nums.length-1) {
				single = nums[i];
				break;
			}
			if (nums[i] != nums[i+1]) {
				single = nums[i];
				break;
			}
		}
		return single;
	}
	
}
