/*
 * author:ReturnOfTheKing
 * 
 * 木材加工
 * 有一些原木，现在想把这些木头切割成一些长度相同的小段木头，需要得到的小段的数目至少为 k。
 * 当然，我们希望得到的小段越长越好，你需要计算能够得到的小段木头的最大长度。
 * 
 *  注意事项
 *  木头长度的单位是厘米。
 *  原木的长度都是正整数，我们要求切割得到的小段木头的长度也要求是整数。
 *  无法切出要求至少 k 段的,则返回 0 即可。
 *  
 *  1.遍历获得单项最大值，然后按照最大值进行二分查找。注意查找完应当进行一次比较，判断是否多了1。
 */
package lintCode;
/*
 * @param L: Given n pieces of wood with length L[i]
 * @param k: An integer
 * @return: The maximum length of the small pieces
 */
public class WoodCut {
	public int woodCut(int[] L, int k) {
        // write your code here
        if(null==L||0==L.length||0==k)
        {
            return 0;
        }
        int min=L[0];
        for(int i:L)
        {
            if(i>min)
            {
                min=i;
            }
        }
        int l=1,r=min;
        int mid=0;
        int temp=0;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            temp=0;
            for(int j:L)
            {
                temp=temp+j/mid;
            }
            if(temp>=k)
            {
                l=mid+1;
            }
            if(temp<k)
            {
                r=mid-1;
            }
        }
        temp=0;
        for(int z:L)
            {
                temp=temp+z/mid;
            }
            if(temp<k)
            {
                mid-=1;
            }
        return mid;
    }
}
