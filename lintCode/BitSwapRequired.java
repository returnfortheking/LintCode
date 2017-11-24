/*
 * author:ReturnOfTheKing
 * 
 * 181. 将整数A转换为B
 * 如果要将整数A转换为B，需要改变多少个bit位？
 * 
 * 样例
 * 如把31转换为14，需要改变2个bit位。
 * (31)10=(11111)2
 * (14)10=(01110)2
 * 
 * 1.按照自己想的没做出来，理解错误。
 * -1是11111...111（32个1），1是0000000000001（31个0）。
 * 2.按位运算，不考虑实际怎样，只要不相等就sum+=1;
 */
package lintCode;

public class BitSwapRequired {
    public int bitSwapRequired(int a, int b) {
        // write your code here
        int temp=a^b;//异或运算，相同为0，不同为1。
        int sum=0;
        System.out.println(temp);
//        for(int i=31;i>=0;i--)
//        {
//            sum=sum+temp/(int)Math.pow(2,i);//Math.pow输出为double，需强制转换
//            temp=temp%(int)Math.pow(2,i);
//        }
//        return sum;
        for(int i = 0; i < 32; i++){//用位运算来统计有几个1
            if(((temp >> i) & 1) == 1)
                sum++;
        }
 
        return sum;
    }
    public static void main(String[] args) {
		BitSwapRequired b=new BitSwapRequired();
		System.out.println(b.bitSwapRequired(1, -1));
		
	}
}
