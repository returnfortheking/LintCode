/*
 * author:ReturnOfTheKing
 * 
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。
 * 如果没有，返回到它将会被按顺序插入的位置。
 * 你可以假设在数组中无重复元素。
 * 
 * 1.较简单，仅需要注意下特殊情况。
 */
package lintCode;

public class SearchInsert {
    public int searchInsert(int[] A, int target) {
        if(A==null||A.length==0)
        {
            return 0;
        }
        int mid=0;
        int l=0,r=A.length-1;
        
        while(l<=r)
        {
        	mid=l+(r-l)/2;
        	if(A[mid]==target)
        	{
        		break;
        	}
        	if(A[mid]>target)
        	{
        		r=mid-1;
        	}
        	if(A[mid]<target)
        	{
        		l=mid+1;
        	}
        }
        if(A[mid]<target)
        {
            mid++;
        }
    	return mid;

    }
}
