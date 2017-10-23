/* author:ReturnOfTheKing
 * 
 * 最长公共子串
 * 给出两个字符串，找到最长公共子串，并返回其长度。
 * 
 * 样例
 * 给出A=“ABCD”，B=“CBCE”，返回 2。
 * 
 * 之前尝试了纯递归的跳转，没做出来。
 * 看了网上答案是用二位数组多出一行一列来迭代。
 * 
 */
package lintCode;

public class LongestCommonSubstring {
    private int LongestCommon(String A, String B) {
    	if(A==null||A.length()==0||B==null||B.length()==0)
    	{
    		return 0;
    	}
    	int maxlen=0;
    	char[] Achar=A.toCharArray(),Bchar=B.toCharArray();
    	int[][] D=new int[Achar.length+1][Bchar.length+1];
    	for(int i=1;i<B.length()+1;i++)
    	{
    		for(int j=1;j<A.length()+1;j++)
    		{
    			if(Achar[j-1]==Bchar[i-1])
    			{
    				D[j][i]=D[j-1][i-1]+1;
    				maxlen=Math.max(maxlen, D[j][i]);	
    			}
    		}
    	}
    	return maxlen;	
    	
    }
    public static void main(String[] args) {
		LongestCommonSubstring l=new LongestCommonSubstring();
		System.out.println(l.LongestCommon("www.ase", "ww.abd"));
	}
}
