/*
 * 两个字符串是变位词
 * 写出一个函数 anagram(s, t) 判断两个字符串是否可以通过改变字母的顺序变成一样的字符串。
 * 
 * author:ReturnOfTheKing
 * 
 * 1.两个全部从小到大排序然后比较。
 * 
 * 
 */
package lintCode;

import javax.print.attribute.standard.Sides;

public class Anagram{
	private boolean ana(String s,String t)
	{
		StringBuffer s1=new StringBuffer(s);
		StringBuffer s2=new StringBuffer(t);
		
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=0;j<s1.length()-1;j++)
			{
				if(s1.charAt(j)>s1.charAt(j+1))
				{
				char temp;
				temp=s1.charAt(j);
				s1.setCharAt(j, s1.charAt(j+1));
				s1.setCharAt(j+1, temp);
				}
				}
			
			
		}
		for(int i=0;i<s2.length()-1;i++)
		{
			for(int j=0;j<s2.length()-1;j++)
			{
				if(s2.charAt(j)>s2.charAt(j+1))
				{
				char temp;
				temp=s2.charAt(j);
				s2.setCharAt(j, s2.charAt(j+1));
				s2.setCharAt(j+1, temp);
				}
				}
			
			
		}
		System.out.println(s1);
		System.out.println(s2);
		s=s1.toString();
		t=s2.toString();
		if(s.equals(t))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Anagram a=new Anagram();
		if(a.ana("ab", "ba"))
		{
			System.out.println("yes");
		}
		else 
		{
			System.out.println("no");
		}
		
	}
}
