/*
 * author:ReturnOfTheKing
 * 
 * 尾部的零
 * 设计一个算法，计算出n阶乘中尾部零的个数
 * 样例
 * 11! = 39916800，因此应该返回 2
 * 
 * 1.统计总共有多少个5相乘即可。
 */
package lintCode;

public class TrailingZeros {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // 1.第一次写的，timeout。2特别多，所以只有5的倍数会造成影响。先统计有多少个5，再统计5^2,5^3...
    	// 后来发现第一种方法没错，是自己把数据类型设成了int然后强制转换，引发了溢出之类的错误。
//        long zero=0;
//        long five=5;
//        while(five<=n)
//        {
//            zero=zero+n/five;
//            five=five*5;
//        }
//        return zero;
        // 2.将1进行反向思维，先除5，再除5，直到除完小于5。计算量和1应该是相同的。
        long zero=0;
        while(n>=5)
        {
            zero=zero+n/5;
            n=n/5;
        }
        return zero;
        
    }
    	
    public static void main(String[] args) {
		TrailingZeros t=new TrailingZeros();
		System.out.println(t.trailingZeros(125));
	}
}
