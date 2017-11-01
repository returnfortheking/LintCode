/*
 * author:ReturnOfTheKing
 * 
 * 数组划分
 * 给出一个整数数组 nums 和一个整数 k。划分数组（即移动数组 nums 中的元素），使得：
 * 所有小于k的元素移到左边
 * 所有大于等于k的元素移到右边
 * 返回数组划分的位置，即数组中第一个位置 i，满足 nums[i] 大于等于 k。
 * 
 * 1.可参考三数之和，双指针秒杀。
 */
package lintCode;

public class PartitionArray {
    public int partitionArray(int[] nums, int k) {
        // write your code here
        if(nums.length==0||nums==null)
        {
            return 0;
        }
        int i=0;
    	int j=nums.length-1;
    	
    	while(i<j)
    	{
    		if(nums[i]<k)
    		{
    			i++;
    			continue;
    		}
    		if(nums[j]>=k)
    		{
    			j--;
    			continue;
    		}
    		nums[i]=(nums[i]+nums[j])-(nums[j]=nums[i]);
    		i++;
    		j--;
    	}
    	if(nums[i]<k)
    	{
    		return i+1;
    	}
    	return i;
    }
}
