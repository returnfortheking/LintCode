/* 
 * author:ReturnOfTheKing
 * 
 * 字符串查找
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中
 * 找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 * 
 * 样例
 * 如果 source = "source" 和 target = "target"，返回 -1。
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 * 
 * 1.两层for循环，时间复杂度n^2。
 * 2.KMP 算法(待补充)
 */
package lintCode;

public class StrSearch {
	 private int strStr(String source, String target) {
	        if(source==null||target==null)
	        {
	            return -1;
	        }else if(target.length()==0)
	        {
	            return 0;
	        }
	        int first=-1;
	        for(int j=0;j<source.length()-target.length()+1;j++)
	            {
	                if(source.charAt(j)==target.charAt(0))
	                {
	                	first=j;
	                	for(int i=0;i<target.length();i++)
	                    {
	                        if(source.charAt(j+i)!=target.charAt(i))
	                        {
	                            first=-1;
	                        	break;
	                        }else if(i==target.length()-1)
	                        {
	                        	return first;
	                        }
	                        
	                    }
	                    
	                }
	            }
	            return first;
	    }
	 public static void main(String[] args) {
		StrSearch s=new StrSearch();
		System.out.println(s.strStr("acbcdabcdefg", "bcd"));
	}
}
