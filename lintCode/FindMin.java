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
 */
package lintCode;

import java.util.LinkedList;
import java.util.TreeSet;

public class FindMin {
    public int findMin(int[] nums) {
    	TreeSet<Integer> l=new TreeSet<Integer>();
    	for(int i:nums)
    	{
    		l.add(i);
    	}
    	return l.first();
    }
    public static void main(String[] args) {
		FindMin f=new FindMin();
		int []a={4,5,6,7,0,1,2,-3};
		System.out.println(f.findMin(a));
	}
}
