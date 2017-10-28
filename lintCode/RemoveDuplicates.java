/*
 * author:ReturnOfTheKing
 * 
 * 删除排序数组中的重复数字
 * 给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。
 * 不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。
 * 
 * 样例
 * 给出数组A =[1,1,2]，你的函数应该返回长度2，此时A=[1,2]。
 * 
 * 1.依次比较，将重复元素放至队尾，并将长度减一。(由于太菜，循环写错排查了半天，晕)
 * 
 */
package lintCode;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
    	if(0==nums.length||null==nums)
    	{
    		return 0;
    	}
    	if(1==nums.length)
    	{
    		return 1;
    	}
    	int poi=0;
    	int end=nums.length-1;
    	int temp=0;
    	while(poi<end)
    	{
    		temp=0;
    		while(temp<end-poi)
    		{
        		if(nums[poi]==nums[poi+temp+1])
        		{
        			for(int i=temp+poi+1;i<end;i++)
        			{
            			nums[i]=(nums[i]+nums[i+1])-(nums[i+1]=nums[i]);
        			}//将重复元素移至队尾。
        			end--;//长度减一
        			
        		}
        		else{
        			temp++;
        		}
    		}
    		poi++;

    	}
    	return end+1;
    }
    public static void main(String[] args)
    {
    	RemoveDuplicates r=new RemoveDuplicates();
    	int[] i={1,2,2,3,4,5};
    	System.out.println(r.removeDuplicates(i));
    }

}
