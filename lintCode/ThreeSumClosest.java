/*
 * author:ReturnOfTheKing
 * 
 * 最接近的三数之和
 * 给一个包含 n 个整数的数组 S, 找到和与给定整数 target 最接近的三元组，返回这三个数的和。
 * 
 * 样例
 * 例如 S = [-1, 2, 1, -4] and target = 1. 
 * 和最接近 1 的三元组是 -1 + 2 + 1 = 2.
 * 
 * 挑战
 * O(n^2) 时间, O(1) 额外空间。
 * 
 * 1.三层for循环遍历所有三元组，效率最低。
 * 
 * 2.最优答案有待补充。
 */
package lintCode;

import java.util.HashMap;

public class ThreeSumClosest {
    public int threeSumClosest(int[] numbers, int target) {
    	int temp=Integer.MAX_VALUE;
    	int t=0;
    	for(int i=0;i<numbers.length-2;i++)
    	{
    		for(int j=i+1;j<numbers.length-1;j++)
    		{
    			for(int k=j+1;k<numbers.length;k++)
    			{
    				t=numbers[i]+numbers[j]+numbers[k]-target;
    				if(Math.abs(t)<Math.abs(temp))
    				{
    					temp=t;
    				}
    			}
    		}
    	}
    	return temp+target;
}
    public static void main(String[] args) {
		ThreeSumClosest t=new ThreeSumClosest();
		int[] numbers={2,7,11,15};
		System.out.println(t.threeSumClosest(numbers, 3));
	}
}