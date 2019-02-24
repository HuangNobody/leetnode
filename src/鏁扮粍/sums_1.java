package สýื้;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[j]==target-nums[i]){
                    //return new int[]{i,j};
                	int [] a={i,j};
                	return a;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public class sums_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sums_1 sum1=new sums_1();
		int [] nums={2,7,11,15};
		int target = 9;
		Solution s=new Solution();
		//s.twoSum(nums,target);
		int [] b=s.twoSum(nums,target);
		System.out.println(Arrays.toString(b));
		
		}
}
