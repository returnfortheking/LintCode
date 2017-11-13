/*
 * author:ReturnOfTheKing
 * 
 * x的平方根
 * 实现 int sqrt(int x) 函数，计算并返回 x 的平方根
 * 
 * 样例
 * sqrt(3) = 1
 * sqrt(4) = 2
 * sqrt(5) = 2
 * sqrt(10) = 3
 * 
 * 
 */
package lintCode;

public class SqrtX {
	public int sqrt(int x) {
        if(x<=0)
        {
            return 0;
        }
        if(x==1)
        {
            return 1;
        }
        int l=0;
        int r=x;
        int mid=1;
        
        while(l<=r)
        {
            
            if(mid==x/mid||(mid<x/mid&&mid+1>x/(mid+1)))
            {
            	return mid;
            }
            mid=l+(r-l)/2;
             if(mid<x/mid)
             {
                 l=mid+1;
             }
             if(mid>x/mid)
             {
                 r=mid-1;
             }
        }
        return mid;
        // write your code here
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SqrtX s=new SqrtX();
		System.out.println(s.sqrt(99));

	}

}
