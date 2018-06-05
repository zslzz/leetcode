/**
 * Created by zslzz on 2018/6/2.
 * 分组，将大于k的放左边，小于k放右边
 * 快排的基本算法，分组
 * 二分查找的基础
 */
public class PartitionArray {
    public int partitionArray(int[] nums,int k){
        int pl=0;
        int pr = nums.length-1;
        while (pl<pr){
            while(pl<=pr &&nums[pl]<k){
                pl++;
            }
            while(pl<=pr && nums[pr]>=k){
                pr--;
            }
            if(pl<=pr){
                swap(pl,pr,nums);
            }
        }
        return pl;
    }
    public void swap(int pl,int pr,int[]nums){
        int tmp = nums[pl];
        nums[pl]=nums[pr];
        nums[pr]=tmp;
    }

//    test
    public static void main(String[] args){
        int[] nums = {1,3,7,2,9,0,8,5};
        int k = 7;
        PartitionArray p = new PartitionArray();
        int re = p.partitionArray(nums,k);
        System.out.print(re);
    }
}
