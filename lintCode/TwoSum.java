/*
 * author:ReturnOfTheKing
 * 
 * 两数之和
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。
 * 注意这里下标的范围是 1 到 n，不是以 0 开头。
 * 
 * 
 */
package lintCode;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
    	int l=numbers.length-1;
    	int f=0;
    	if(l%2==0)
    	{
    		while(target!=(numbers[f]+numbers[l]))
        	{
        		if(target>(numbers[f]+numbers[l]))
        		{
        			f=(f+l)/2;
        		}else if(target<(numbers[f]+numbers[l]))
        		{
        			l=(f+l)/2;
        		}
        	}
    	}else{
    		while(target!=(numbers[f]+numbers[l]))
        	{
        		if(target>(numbers[f]+numbers[l]))
        		{
        			f=(f+l)/2;
        		}else if(target<(numbers[f]+numbers[l]))
        		{
        			l=(f+l+1)/2;
        		}
        	}
    	}
    	
    	int B[]=new int[2];
    	B[0]=f+1;
    	B[1]=l+1;
    	return B;
        
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] C={1,2,4,8,13,22,36};
		TwoSum t=new TwoSum();
		System.out.println(t.twoSum(C,35));
	}

}
