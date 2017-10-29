/*
 * author:ReturnOfTheKing
 * 
 * 丢失的第一个正整数
 * 给出一个无序的整数数组，找出其中没有出现的最小正整数。
 * 
 * 样例
 * 如果给出 [1,2,0], return 3
 * 如果给出 [3,4,-1,1], return 2
 * 
 * 挑战
 * 只允许时间复杂度O(n)的算法，并且只能使用常数级别的空间。
 * 
 * 1.用哈希表实现了O(n)时间复杂度，但是空间复杂度没降下来。有待之后补充
 */

package lintCode;

import java.util.HashMap;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] A) {
        // write your code here
        if(A==null||A.length==0)
        {
            return 1;
        }
        HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
    	for(int i=0;i<A.length;i++)
    	{
    		h.put(A[i], 1);
    	}
    	int j=1;
    	while(h.get(j)!=null)
    	{
    		j++;
    	}
    	return j;
    }
}
