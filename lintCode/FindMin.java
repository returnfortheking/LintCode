/*
 * author:ReturnOfTheKing
 * 
 * 寻找旋转排序数组中的最小值 
 * 
 * 假设一个旋转排序的数组其起始位置是未知的（比如0 1 2 4 5 6 7 可能变成是4 5 6 7 0 1 2）。
 * 你需要找到其中最小的元素。
 * 你可以假设数组中不存在重复的元素。
 * 
 * 1.用了基于红黑树的treeset。
 * 2.二分查找。难点在于如何处理特殊情况。
 * 
 */
package lintCode;

import java.util.LinkedList;
import java.util.TreeSet;

public class FindMin {
    public int findMin(int[] A) {
//    	TreeSet<Integer> l=new TreeSet<Integer>();
//    	for(int i:nums)
//    	{
//    		l.add(i);
//    	}
//    	return l.first();
    	if(null==A||0==A.length)
        {
            return -1;
        }
        int l=0,r=A.length-1;
        int mid=0;
        int target=A[r];//创建一个临时变量记录最小值
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(target>A[mid])//中值小于临时的最小值
            {
                if(mid-1>=0)//数组下标不能为负
                {
                    if(A[mid]<A[mid-1])//找到最少值直接输出
                    {
                       return A[mid];
                    }
                    r=mid-1;
                    target=A[mid];//更新最小值
                }else
                {
                    return A[mid];//索引到了最左端依然小于临时最小值
                }
                
            }
            else if(target<A[mid])//比临时最小值大不予操作
            {
                l=mid+1;
            }else{//中值等于临时最小值，直接输出
                return target;
            }
        }
        return A[mid];//输出最后的临时最小值。
    
    	
    }
    public static void main(String[] args) {
		FindMin f=new FindMin();
		int []a={4,5,6,7,0,1,2,-3};
		System.out.println(f.findMin(a));
	}
}
