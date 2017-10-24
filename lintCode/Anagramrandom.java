/*
 * author:ReturnOfTheKing
 * 
 * 乱序字符串
 * 给出一个字符串数组S，找到其中所有的乱序字符串(Anagram)。
 * 如果一个字符串是乱序字符串，那么他存在一个字母集合相同，但顺序不同的字符串也在S中。
 * 
 * 样例
 * 对于字符串数组 ["lint","intl","inlt","code"]
 * 返回 ["lint","inlt","intl"]
 * 
 * 1.建立两个list，一个用于存储排序后的字符串，一个用作最后输出
 * 将字符串排序，并依次比较，只要出现第二个相同的字符串则将对应原始数据存入list
 */
package lintCode;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Anagramrandom {
	public ArrayList<String> anagrams(String[] strs) {
        // write your code here
		if(strs==null||strs.length==0)
		{
			return null;
		}
		ArrayList<String> m=new ArrayList<String>();
		ArrayList<String> m2=new ArrayList<String>();
		StringBuffer[] s=new StringBuffer[strs.length];

		char c;
        for(int l=0;l<strs.length;l++)//将String数组排序
        {	
        	s[l]=new StringBuffer(strs[l]);
        	for(int i=0;i<s[l].length();i++)
        	{
        		for(int j=i+1;j<s[l].length();j++)
        			if(s[l].charAt(j)<s[l].charAt(i))
        			{
        				c=s[l].charAt(j);
        				s[l].setCharAt(j, s[l].charAt(i));
        				s[l].setCharAt(i, c);
        				
        			}
        	}
        }
        
        for(int i=0;i<strs.length;i++)//新旧String数组存入两个list
        {
        	m.add(s[i].toString());
        }
        for(int i=0;i<m.size();i++)//若有相同元素则添加。
        {
        	int count=0;
        	for(int j=0;j<m.size();j++)
        	{
        		if(i==j)
        		{
        		    continue;
        		}
        		if(m.get(i).equals(m.get(j)))
        		{
        			count++;
        		}
        	}
        	if(count!=0)
        	{
        		m2.add(strs[i]);
        	}
        }
        return m2;
    }

}
