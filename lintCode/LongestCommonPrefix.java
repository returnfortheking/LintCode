/*
 * author:ReturnOfTheKing
 * 
 * 最长公共前缀
 * 给k个字符串，求出他们的最长公共前缀(LCP)
 * 
 * 样例
 * 在 "ABCD" "ABEF" 和 "ACEF" 中,  LCP 为 "A"
 * 在 "ABCDEFG", "ABCEFG", "ABCEFA" 中, LCP 为 "ABC"
 * 
 * 1.依次比较首字母，若相等累加到输出，若不等直接输出。很简单。
 * 主要需要处理各种越界和空指针的情况。
 */
package lintCode;

public class LongestCommonPrefix {
	private String longestCommonPrefix(String[] strs) {
        // write your code here
        String s="";
        if(strs.length==0||strs==null)
        {
            return s;
        }
        int temp=strs[0].length();
        for(int i=1;i<strs.length;i++)
        {
        	if(temp>strs[i].length())
        	{
        		temp=strs[i].length();
        	}
        }
        for(int i=0;i<temp;i++)
        {
        	for(int j=1;j<strs.length;j++)
        	{
        		if(strs[0].charAt(i)!=strs[j].charAt(i))
        		{
        			return s;
        		}
        	}
        	s+=strs[0].charAt(i);
        }
        return s;
    }
	public static void main(String[] args) {
		LongestCommonPrefix l=new LongestCommonPrefix();
		String[] n={"ABCDEFG", "ABCEFG", "ABCEFA"};
		System.out.println(l.longestCommonPrefix(n));
	}
}
