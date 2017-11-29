/*
 * author:ReturnOfTheKing
 * 
 * 46. 主元素
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 * 
 * 样例
 * 给出数组[1,1,1,1,2,2,2]，返回 1
 * 
 * 挑战 
 * 要求时间复杂度为O(n)，空间复杂度为O(1)
 * 
 * 1.暴力解决。遍历数组存入HashMap，key为数组中数字，value为出现次数
 * 	   遍历HashMap，找到value大于List1/2的那个key值。
 * 	 List长度 list.size()
 * 
 * 2.贪心算法
 * 	 	待补充。
 */
package lintCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityNumber {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        if(nums.size()==0||null==nums)
        {
            return 0;
        }
        for(int i:nums)
        {
            if(null!=m.get(i))
            {
                int temp=m.get(i);
                m.remove(i);
                m.put(i,temp+1);
                continue;
            }
            m.put(i,1);
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet())
        {
            if(entry.getValue()>nums.size()/2)
            {
                return entry.getKey();
            }
        }
        return 0;
    }
}
