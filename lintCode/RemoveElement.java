/* 
 * author:ReturnOfTheKing
 * 
 * 删除元素
 * 给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。
 * 元素的顺序可以改变，并且对新的数组不会有影响。
 * 
 * 样例
 * 给出一个数组 [0,4,4,0,0,2,4,4]，和值 4
 * 返回 4 并且4个元素的新数组为[0,0,0,2]
 * 
 * 尚未理解为什么不是生成新数组，数组长度不是一开始就固定了吗，所以
 * 就算确认了重复元素数量应该也无法将原来的数组削成只含剩余元素的数组才对。
 * 答案给的也仅仅是将未重复的数放在前面。
 * 
 */
package lintCode;

import java.util.ArrayList;

public class RemoveElement {
	  public int removeElement(int[] A, int elem) {
	        if(A == null || A.length == 0)
	            return 0;
	 
	        if(A.length == 1)
	            return A[0] == elem ? 0 : 1;
	 
	        int left = 0;
	        int i = 0;
	        int right = A.length - 1;
	 
	        while(i < right){
	            if(A[i] == elem)
	                swap(A, i, right--);
	            else
	                i++;
	        }
	 
	        return A[right] == elem ? right : right + 1;
	    }
	 
	    public void swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	 
	        return;
	    }
}
