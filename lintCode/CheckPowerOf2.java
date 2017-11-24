/*
 * author:ReturnOfTheKing
 * 
 * 用 O(1) 时间检测整数 n 是否是 2 的幂次。
 * 样例
 * n=4，返回 true;
 * n=5，返回 false.
 * 
 * 1.2的幂次都是00010000这个形式，即从右往左31位有且只有1位1。所以记录总共有多少1，多于1位是1肯定不是幂次。
 */

package lintCode;

public class CheckPowerOf2 {
    public boolean checkPowerOf2(int n) {
        // 1.自己写的方法，虽然通过了，但是感觉有问题。100...01（30个0）会被当作2的幂数。应该先排除n<=0的情况。
//        int sum=0;
//        for(int i=0;i<31;i++)
//        {
//            if(((n>>i)&1)==1)
//            {
//                sum++;
//            }
//        }
//        if(sum!=1)
//        {
//            return false;
//        }
//        return true;
    	//1.加上了判断n<=0的情况，因为正数第一位是0所以最多只需要移位31次就行了。
        if(n<=0)
        {
            return false;
        }
        int sum=0;
        for(int i=0;i<31;i++)
        {
            if(((n>>i)&1)==1)
            {
                sum++;
            }
        }
        if(sum!=1)
        {
            return false;
        }
        return true;
    }
}
