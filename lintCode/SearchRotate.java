/*
 * author:ReturnOfTheKing
 * 
 * 搜索旋转排序数组
 * 假设有一个排序的按未知的旋转轴旋转的数组(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。
 * 给定一个目标值进行搜索，如果在数组中找到目标值返回数组中的索引位置，否则返回-1。
 * 你可以假设数组中不存在重复的元素。
 * 
 * 样例
 * 给出[4, 5, 1, 2, 3]和target=1，返回 2
 * 给出[4, 5, 1, 2, 3]和target=0，返回 -1
 * 
 * 1.暴力实现。略
 * 2.二分查找。难点主要在如何排除特殊情况。
 */
package lintCode;

public class SearchRotate {
    public int searchrotate(int[] A, int target) {
        // write your code here
        if(null==A||0==A.length)//去除空数组情况
        {
            return -1;
        }
        int l=0,r=A.length-1;
        int mid=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(target==A[mid])//中值找到直接输出
            {
                return mid;
            }
            if(target>A[mid])//目标大于中值
            {
                if(A[mid]<A[l]&&A[r]<target)//当中值位于第二子数组且目标值不在第二子数组
                {
                    r=mid-1;
                    continue;
                }
                l=mid+1;
            }
            if(target<A[mid])//目标小于中值
            {
                if(A[mid]>A[r]&&A[l]>target)//当中值位于第一数组，且目标值不在第一数组
                {
                    l=mid+1;
                    continue;
                }
                r=mid-1;
            }
        }
        return -1;
    }

}
