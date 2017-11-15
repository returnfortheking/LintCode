/*
 * author:ReturnOfTheKing
 * 
 * 两数之和
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。
 * 注意这里下标的范围是 1 到 n，不是以 0 开头。
 * 
 * 1.建立一个长度相同的新数组，令新数组每个位置的值至等于target减旧数组相应位置的值。
 * 依次比较新旧数组，有相同元素的两个位置即为所求。
 */
package lintCode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // 时间复杂度n和nlogn尚待完成。
//    	int[] B=new int[numbers.length];
//    	for(int i=0;i<numbers.length;i++)
//    	{
//    		numbers[]=target-numbers[i];
//    	}
    	//1.n^2时间复杂度。
//        int[] two=new int[2];
//        for(int i=0;i<nums.length-1;i++)
//        {
//            for(int j=i+1;j<nums.length;j++)
//            {
//                if(target==(nums[i]+nums[j]))
//                {
//                    two[0]=i+1;
//                    two[1]=j+1;
//                }
//            }
//        }
//        return two;
        //2.n时间复杂度
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int[] A=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            h.put(target-nums[i],i);
        }
        for(int j=0;j<nums.length;j++)
        {
        	if(null!=h.get(nums[j])&&j!=h.get(nums[j]))
        	{
        		if(j>h.get(nums[j]))
        		{
        			A[0]=h.get(nums[j]);
        			A[1]=j;
                    break;
        		}else{
        			A[0]=j;
        			A[1]=h.get(nums[j]);
                    break;
        		}
        	}
        }
        return A;
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] C={1,2,4,8,13,22,36};
		TwoSum t=new TwoSum();
		System.out.println(t.twoSum(C,35));
	}

}
