/*
 * author:ReturnOfTheKing
 * 
 * 寻找峰值
 * 你给出一个整数数组(size为n)，其具有以下特点：
 * 相邻位置的数字是不同的
 * A[0] < A[1] 并且 A[n - 2] > A[n - 1]
 * 假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。
 * 
 * 1.顺序遍历，TIMEOUT
 * 2.二分查找，注意mid的计算和leftright的选取。
 * 3.双指针
 */
package lintCode;

public class FindPeak {
    public int findPeak(int[] A) {
//		1.顺序遍历，timeout；
//        if(A.length==3)
//        {
//            return 1;
//        }
//        for(int i=1;i<A.length-1;i++)
//    	{
//    		if(A[i]>A[i-1]&&A[i]>A[i+1])
//    		{
//    			return i;
//    		}
//    	}
//    	return -1;
    	
//    	2.二分查找
        if(A.length==3)
        {
            return 1;
        }
        int left=1,right=A.length-2;
        int mid=1;
        while(left<=right)
        {
            mid=left+(right-left)/2; 
        	if(A[mid]<A[mid-1])
        	{
                right=mid-1;
        		continue;
        	}
        	if(A[mid]<A[mid+1])
        	{
        		left=mid+1;
        		continue;
        	}if(A[mid]>A[mid-1]&&A[mid]>A[mid+1])
        	{
        		break;
        	}
        }
        return mid;
    }

	public static void main(String[] args) {
		FindPeak f=new FindPeak();
		int[] A={1,2,1,3,4,5,7,6};
		System.out.println(f.findPeak(A));

	}

}
