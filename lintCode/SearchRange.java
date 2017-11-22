/*
 * author:ReturnOfTheKing
 * 
 * 搜索区间
 * 给定一个包含 n 个整数的排序数组，找出给定目标值 target 的起始和结束位置。
 * 如果目标值不在数组中，则返回[-1, -1]
 * 样例
 * 给出[5, 7, 7, 8, 8, 10]
 * 目标值target=8,
 * 返回[3, 4]
 * 
 * 1.用两次二分查找，分别找上界和下界。
 */
package lintCode;

public class SearchRange {
    /*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int [] result={-1,-1};
        if(0==A.length||null==A)
        {
            return result;
        }
        int l1=0,r1=A.length-1;
        int mid1=l1+(r1-l1)/2;
        while(l1<=r1)
        {
            mid1=l1+(r1-l1)/2;
            if(mid1-1>=0)
            {
                if(target==A[mid1]&&A[mid1-1]!=target)//找最小范围。
                {
                    result[0]=mid1;
                    break;
                }
                else if(target>A[mid1])
                {
                    l1=mid1+1;
                }else{
                    r1=mid1-1;
                }
            }else{
                if(A[0]==target)
                {
                    result[0]=0;
                    break;
                }
                result[0]=-1;
                break;
            }
        }
        int l2=0,r2=A.length-1;
        int mid2=l2+(r2-l2)/2;
        while(l2<=r2)
        {
            mid2=l2+(r2-l2)/2;
            if(mid2+1<=A.length-1)
            {
                if(target==A[mid2]&&A[mid2+1]!=target)//找最大范围。
                {
                    result[1]=mid2;
                    break;
                }
                else if(target>=A[mid2])
                {
                    l2=mid2+1;
                }else{
                    r2=mid2-1;
                }
            }else{
                if(A[A.length-1]==target)
                {
                    result[1]=A.length-1;
                    break;
                }
                result[1]=-1;
                break;
            }
        }
        return result;
    }

}
