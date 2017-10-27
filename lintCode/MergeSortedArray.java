/*
 * author:ReturnOfTheKing
 * 
 * 合并排序数组 II
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * 
 * 注意事项
 * 你可以假设A具有足够的空间（A数组的大小大于或等于m+n）去添加B中的元素。
 *  
 * 样例
 * 给出 A = [1, 2, 3, empty, empty], B = [4, 5]
 * 合并之后 A 将变成 [1,2,3,4,5]
 *  
 * 1.先合并，再冒泡排序。TimeLimitExceeded
 * 2.从A和B的末尾依次比较，将最大项依次放到A的末尾
 * 
 */
package lintCode;

public class MergeSortedArray {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
//		第一种方法timeout。
//    	由于数组是已经排序过的，所以在重新排序的时候浪费了很多次比较。时间复杂度n^2超出要求。
//    	for(int l=0;l<n;l++)
//    	{
//    		A[m+l]=B[l];
//    	}
//    	for(int j=0;j<=m+n-2;j++)
//    	{
//    		for(int i=0;i<=m+n-2;i++)
//    		{
//        		if(A[i]>A[i+1])
//        		{
//        			A[i]=(A[i]+A[i+1])-(A[i+1]=A[i]);
//        		}
//    		}
//    	}
    	
    	int a=m,b=n;
    	if(m==0)
    	{
    	    for(int k=0;k<n;k++)
    	    {
    	        A[k]=B[k];
    	    }
    	}
    	while(a>0&&b>0)//第二种方法，从A和B的末尾开始比较，将较大的放在A末尾。
    	{
    		if(A[a-1]>=B[b-1])
    		{
    			A[a+b-1]=A[a-1];
    			a--;
    		}else
    		{
    			A[a+b-1]=B[b-1];
    			b--;
    		}
    		if(a==0)
    		{
    		    for(int i=b;i>0;i--)
    		    {
    		        A[i-1]=B[i-1];
    		    }
    		}   
    	}
    	
    }
}
