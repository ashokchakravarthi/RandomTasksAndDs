public class RotateArrayKtimes
{
    public static void main(String[] args)
    {
        int[] nums = {0,1,2,3,4,5,6};
        int k = 5;
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        for(int num: nums)
        {
            System.out.println(num);
        }
    }

    public static void reverse(int[] nums, int start, int end)
    {
        while (start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}