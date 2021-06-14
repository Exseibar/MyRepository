package something;

public class Arrays {
	public static void main(String[] args) {

		int[] nums = new int[10];
		int[] nums2 = new int[nums.length];
		int temp = nums.length - 1;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 11);
			nums2[temp] = nums[i];
			temp--;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
	}
}