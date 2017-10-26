/*
 * author:ReturnOfTheKing
 * 
 * 子数组之和
 * 给定一个整数数组，找到和为零的子数组。
 * 你的代码应该返回满足要求的子数组的起始位置和结束位置。
 * 
 * 样例
 * 给出 [-3, 1, 2, -3, 4]，返回[0, 2] 或者 [1, 3].
 * 
 * 1.比较简单，两层for循环。
 */
package lintCode;

import java.util.ArrayList;
import java.util.List;

public class SubarraySum {
	
    private List<Integer> subarraySum(int[] nums) {
    	List<Integer> l=new ArrayList<Integer>();
    	if(null==nums||nums.length==0)
    	{
    		return l;
    	}
    	int total=0;
    	for(int i=0;i<nums.length;i++)
    	{
    		total=0;
    		for(int j=i;j<nums.length;j++)
    		{
        		total+=nums[j];
        		if(total==0)
        		{
        			l.add(j);
        			l.add(i);
        			return l;
        		}
    		}

    	}
    	return l;

    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
