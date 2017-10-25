/*
 * author:ReturnOfTheKing
 * 
 * 转换字符串到整数
 * 实现atoi这个函数，将一个字符串转换为整数。
 * 如果没有合法的整数，返回0。
 * 如果整数超出了32位整数的范围，返回INT_MAX(2147483647)
 * 如果是正整数，或者INT_MIN(-2147483648)如果是负整数。
 * 
 * 样例
 * "10" =>10
 * "-1" => -1
 * "123123123123123" => 2147483647
 * "1.0" => 1
 * 
 * 1.我写的是若字符串不合法则返回0（例如"  ","1ab12","1 1 1","1."），可以识别首尾的重复空格和12.0000这类整数。
 * 
 * 2.提交时发现里面的要求是不论首尾如何，只要字符串中出现过连续数字就将其转换为整数，不论格式是否规范（例如abc12.adsfe会被识别为12）
 */
package lintCode;
public class Atoi {
//    private int atoi(String s) {
//        // write your code here
//        if(s==null||s.length()==0)
//        {
//        	return 0;
//        }
//
//        while(s.charAt(0) == ' ') {
//            s = s.substring(1, s.length());
//        }
//        while(s.charAt(s.length() - 1) == ' ') {
//            s = s.substring(0, s.length() - 1);
//        }       		
//        double total=0;
//        char[] c=s.toCharArray();
//        char[] cnew=new char[s.length()-1];
//        int plus=1;int n1=0,n2=0;
//
//        	
//        	if(c[0]!='-')
//        	{
//                for(int i=0;i<c.length;i++)
//                {
//            	if((c[i]>'9'||c[i]<'0')&&c[i]!='.')
//            	{
//            		return 0;
//            	}else if(c[i]=='.')
//            	{
//            		if(i==c.length-1)
//            		{
//            			return 0;
//            		}
//            		for(int m=i+1;m<c.length;m++)
//            		{
//            			if(c[m]!='0')
//            			{
//            				return 0;
//            			}
//            		}
//            		for(int o=0;o<i;o++)
//            		{
//            			total=total+Math.pow(10,(n1--)+i-1)*(c[o]-'0');
//            			if(total>Integer.MAX_VALUE)
//                		{
//                			return Integer.MAX_VALUE;
//                		}
//            		}
//            		return (int)total;
//            	}
//                }
//        	}else {
//        		for(int j=1;j<c.length;j++)
//        		{
//                	if((c[j]>'9'||c[j]<'0')&&c[j]!='.')
//                	{
//                		return 0;
//                	}
//                	else if(c[j]=='.')
//                	{
//                		if(j==c.length-1)
//                		{
//                			return 0;
//                		}
//                		for(int m=j+1;m<c.length;m++)
//                		{
//                			if(c[m]!='0'||c[m]=='\u0000')
//                			{
//                				return 0;
//                			}
//                		}
//                		for(int m=1;m<j;m++)
//                		{
//                			total=total+Math.pow(10,(n2--)+j-2)*(c[m]-'0');
//                			if(total>Integer.MAX_VALUE)
//                    		{
//                    			return Integer.MIN_VALUE;
//                    		}
//                		}
//                		return (int)(total*-1);
//                	}
//        		}
//        		for(int l=0;l<c.length-1;l++)
//        		{
//        			cnew[l]=c[l+1];
//        		}
//        		plus=-1;
//            	}
//			
//        
//        int num=0;
//        Character c1='\u0000';
//        if(cnew.length==0){
//        	return 0;
//        }
//    	if(plus==1)
//    	{
//    		for(int i=0;i<c.length;i++)
//        	{
//        		c1=c[c.length-i-1];
//        		total=total+(c1-'0')*Math.pow(10, num++);
//        		if(total>Integer.MAX_VALUE&&plus==1)
//        		{
//        			return Integer.MAX_VALUE;
//        		}else if(total>Integer.MAX_VALUE&&plus==-1)
//        		{
//        			return Integer.MIN_VALUE;
//        		}
//        	}
//    	}else if(plus==-1)
//        for(int i=0;i<cnew.length;i++)
//    	{
//    		c1=cnew[cnew.length-i-1];
//    		total=total+(c1-'0')*Math.pow(10, num++);
//    		if(total>Integer.MAX_VALUE&&plus==1)
//    		{
//    			return Integer.MAX_VALUE;
//    		}else if(total>Integer.MAX_VALUE&&plus==-1)
//    		{
//    			return Integer.MIN_VALUE;
//    		}
//    	}
//    	return (int) (total*plus);
//    	
//        }

    	
    public int atoi(String str) {
        // write your code here
        if(str == null || str.length() == 0) return 0;
        
        int index = 0, plus = 1, num = 0;
        char[] charS = str.toCharArray();
        
        while(index < charS.length && !(charS[index] == '+' || charS[index] == '-' || (charS[index] >= '0' && charS[index] <= '9'))) index++;
        
        if(index == charS.length) return num;
        
        if(charS[index] == '+') 
            index++;
        else if(charS[index] == '-'){
            plus = -1;
            index++;
        }
        
        while(index < charS.length && charS[index] >= '0' && charS[index] <= '9'){
            if(plus == 1 && (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && charS[index] - '0' > Integer.MAX_VALUE % 10))) return Integer.MAX_VALUE;
            
            if(plus == -1 && (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && '0' - charS[index] < Integer.MIN_VALUE % 10))) return Integer.MIN_VALUE;
            
            num = num*10 + plus*(charS[index++] - '0');
        }
        
        return num;
    }
	public static void main(String[] args) {
	Atoi a=new Atoi();
	System.out.println(a.atoi("  +12asd40.0"));
    }
}
