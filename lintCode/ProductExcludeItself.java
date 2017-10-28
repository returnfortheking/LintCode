/*
 * author:ReturnOfTheKing
 * 
 * 数组剔除元素后的乘积
 * 给定一个整数数组A。
 * 定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]， 计算B的时候请不要使用除法。
 * 
 * 1.很简单的题。
 */

package lintCode;

import java.util.ArrayList;
import java.util.List;

public class ProductExcludeItself {
	public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
    	List<Long> l=new ArrayList<Long>();
    	long temp=1;
    	for(int i=0;i<nums.size();i++)
    	{
    		temp=1;
    		for(int j=0;j<nums.size();j++){
    			if(i==j)
    			{
    				continue;
    			}
    			temp=temp*nums.get(j);
    		}
    		l.add(i, temp);
    	}
    	return l;
    }
}
