/*
 * author:ReturnOfTheKing
 * 
 * 82.落单的数
 * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 * 
 * 样例
 * 给出 [1,2,2,1,3,4,3]，返回 4
 * 
 * 1.遍历数组，建立HashMap将每个数存为key，出现一次value为1，出现两次value为2
 *   遍历HashMap，找到value为1的key值。
 *   主要注意遍历HashMap的方法for(Map.Entry<Integer, Integer> entry:m.entrySet())
 * 2.贪心算法
 * 		待补充。。。
 *   
 */
package lintCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumber {
    public int singleNumber(int[] A) {
    	int res=0;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i:A)
        {
            if(null!=m.get(i))
            {
                m.remove(i);
                m.put(i,2);
                continue;
            }
            m.put(i,1);
        }
        for(Map.Entry<Integer, Integer> entry:m.entrySet())
        {
        	if(entry.getValue()==1)
        	{
        		return entry.getKey();
        	}
        }
        return res;
    }
    public static void main(String[] args) {
		SingleNumber s=new SingleNumber();
		int[] A={1,1,2,2,3,4,4};
		System.out.println(s.singleNumber(A));
	}
}
