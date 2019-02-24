package สýื้;

import java.util.Arrays;

public class Solution_1 {

	public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={2,7,11,15};
		int target = 9;
		Solution_1 s=new Solution_1();
		int [] b=s.twoSum(nums,target);
		System.out.println(Arrays.toString(b));

	}

}
