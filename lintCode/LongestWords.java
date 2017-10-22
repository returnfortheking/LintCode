/*
 * 133 最长单词
 * 给一个词典，找出其中所有最长的单词。
 * 
 * author:ReturnOfTheKing
 * 
 * 1.记录最长长度为temp，遍历一次dictionary，若该字符串长度大于temp，更新temp并移除list中所有元素，若
 * 等于temp，添加该字符串至list。
 */
package lintCode;

import java.util.ArrayList;
import java.util.List;

public class LongestWords {
	private List<String> lon(String[] dictionary)
	{
		List<String> l =new ArrayList<String>();
		int temp=0,i=0;
		for(String c:dictionary)
		{
			if(c.length()>temp)
			{
				temp=c.length();
				l.clear();
				l.add(dictionary[i]);
			}else if(c.length()==temp)
			{
				l.add(dictionary[i]);
			}
			
			i++;
		}
		return l;
	}
	public static void main(String[] args) {
		LongestWords l=new LongestWords();
		String[] s={"dog","goo","fac"};
		String a=l.lon(s).toString();
		System.out.println(a);
		
	}
}