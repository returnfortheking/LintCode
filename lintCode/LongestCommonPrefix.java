package lintCode;

public class LongestCommonPrefix {
	private String longestCommonPrefix(String[] strs) {
        // write your code here
        String s="";
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
        	for(int j=1;j<temp;j++)
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
		String[] n={};
		System.out.println(l.longestCommonPrefix(n));
	}
}
