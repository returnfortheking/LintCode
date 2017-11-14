/*
 * author:ReturnOfTheKing
 * 
 * 二分查找
 * 给定一个排序的整数数组（升序）和一个要查找的整数target
 * 用O(logn)的时间查找到target第一次出现的下标（从0开始）
 * 如果target不存在于数组中，返回-1。
 * 
 * 1.主要注意如何处理重复情况，其余交简单。
 */

package lintCode;

public class BinarySearch {
	public int binarySearch(int[] nums, int target) {
        int mid=(nums.length-1)/2;
        int l=0,r=nums.length-1;
        while(l<=r)
        {

            if(mid!=0)
            {
                if(nums[mid]==target&&target==nums[mid-1])
                {
                    mid--;
                    continue;
                }
            }
            if(nums[mid]==target)
            {
                break;
            }
            mid=l+(r-l)/2;
            if(nums[mid]>target)
            {
                r=mid-1;
            }else
            {
                l=mid+1;
            }
        }
        if(nums[mid]!=target)
        {
            return -1;
        }
        return mid;
    }
}
