/*author:ReturnOfTheKing
 * 
 * 55 比较字符串
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。
 * 
 * 样例
 * 给出 A = "ABCD" B = "ACD"，返回 true
 * 给出 A = "ABCD" B = "AABC"， 返回 false
 * 
 * 1.分别存入两个list，遍历b和a比较，若a中有相同元素则移除继续循环，若无则返回false。遍历结束返回false。
 */
package lintCode;

import java.util.ArrayList;
import java.util.List;

public class CompareStrings {
	
	private boolean compareStrings(String A, String B)
	{
		List<Character> a=new ArrayList<Character>();
		List<Character> b=new ArrayList<Character>();
		char temp;
		for(int i=0;i<A.length();i++)
		{
			a.add(A.charAt(i));
		}
		for(int i=0;i<B.length();i++)
		{
			b.add(B.charAt(i));
		}
		for(int i=0;i<B.length();i++)
		{
			if(a.contains(b.get(i)))
			{
				a.remove(b.get(i));
			}else {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		CompareStrings c=new CompareStrings();
		if(c.compareStrings("AAACB", "ABD"))
		{
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
