/*
 * Author:ReturnOfTheKing
 * 
 * 搜索二维矩阵
 * 写出一个高效的算法来搜索 m × n矩阵中的值。
 * 这个矩阵具有以下特性：
 * 每行中的整数从左到右是排序的。
 * 每行的第一个数大于上一行的最后一个整数。
 * 
 * 
 */
package lintCode;

public class SearchMatrix {
    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||null==matrix)
        {
            return false;
        }
        int l1=0,l2=0;
        int r1=matrix.length-1;
        int mid1=0,mid2=0;
        while(l1<=r1)
        {
        	mid1=l1+(r1-l1);
        	if(matrix[mid1][0]==target)
        	{
        	    return true;
        	}else if(matrix[mid1][0]>target)
        	{
        		r1=mid1-1;
        	}else{
        		l1=mid1+1;
        	}
        }
        int r2=matrix[mid1].length-1;
        while(l2<=r2)
        {
        	mid2=l2+(r2-l2);
        	if(matrix[mid1][mid2]==target)
        	{
        		return true;
        	}
        	if(matrix[mid1][mid2]>target)
        	{
        		r2=mid2-1;
        	}else if(matrix[mid1][mid2]<target){
        		l2=mid2+1;
        	}
        }
        return false;
        
        // write your code here
    }
}

















