/*
 * author:ReturnOfTheKing
 * 
 * 三数之和
 * 
 * 1.用hashMap做不出来，因为key值不唯一，无法索引。
 * 2.用双指针,n^2,这个算法很巧妙，之前以为不能遍历，想错了。多用了一个指针，节省了一次遍历
 */
package lintCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] numbers) {
//    	1.hashMap未成功。
//    	Arrays.sort(numbers);
//    	
//    	List<List<Integer>> l2=new ArrayList<List<Integer>>();
//    	HashMap<Integer, Integer[]> h=new HashMap<Integer, Integer[]>();
//    	for(int a=0;a<numbers.length-1;a++)
//    	{
//    		for(int b=a+1;b<numbers.length;b++)
//    		{
//    			Integer[] temp={a,b};
//    			h.put(-numbers[a]-numbers[b],temp);
//    		}
//    	}
//    	for(int c=0;c<numbers.length;c++)
//    	{
//        	if(h.get(numbers[c])!=null&&c!=h.get(numbers[c])[0]&&c!=h.get(numbers[c])[1])
//        	{
//        		List<Integer> l1=new ArrayList<Integer>();
//        		l1.add(0,numbers[h.get(numbers[c])[0]]);
//        		l1.add(1,numbers[h.get(numbers[c])[1]]);
//        		l1.add(2,numbers[c]);
//        		Collections.sort(l1);
//        		if(!l2.contains(l1))
//        		{
//            		l2.add(l1);
//        		}
//        	}
//    	}
//    	return l2;
    	Arrays.sort(numbers);
    	List<List<Integer>> l2=new ArrayList<List<Integer>>();
    	if(numbers.length<3)
    	{
    	    return null;
    	}
    	if(numbers.length==3)
    	{
    	    if(numbers[0]+numbers[1]+numbers[2]!=0)
    	    {
    	        return null;
    	    }else{
    	        List<Integer> l1=new ArrayList<Integer>();
            		l1.add(0,numbers[0]);
            		l1.add(1,numbers[1]);
            		l1.add(2,numbers[2]);
            		l2.add(l1);
            		return l2;
    	    }
    	}
    	
    	for(int a=0;a<numbers.length-2;a++)
    	{  			
            if(a > 0 && numbers[a] == numbers[a - 1])
            { continue;	}
    		int left=a+1;
        	int right=numbers.length-1;
        	int mid=left+(right-left)/2;
        		while(left<right)
        		{
        		if(numbers[a]+numbers[left]+numbers[right]>0)
        		{
        			right--;
        		}else if(numbers[a]+numbers[left]+numbers[right]<0)
        		{
        			left++;
        		}else
        		{
            		List<Integer> l1=new ArrayList<Integer>();
            		l1.add(0,numbers[a]);
            		l1.add(1,numbers[left]);
            		l1.add(2,numbers[right]);
            		l2.add(l1);
            		left++;
            		while(left<right&&numbers[left]==numbers[left-1])
            		{
            			left++;
            		}
            		right--;
            		while (left<right&&numbers[right]==numbers[right+1]) 
            		{
            			right--;
						
					}
            		
        		}
        		}
    		}

    	
    	return l2;

    }
    public static void main(String[] args) {
		ThreeSum t =new ThreeSum();
		int [] i={1,0,-1,-1,-1,-1,0,1,1,1};
		t.threeSum(i);
	}
}
