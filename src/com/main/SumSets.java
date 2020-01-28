public class SumSets
{
    static int target = 16;
    public static void findTotal(int[] arr, int n, int[] curr, int r)
    {
        if(r==n)
        {
            return;
        }

        if(processSolution(arr, curr) == target)
        {
            for(int val: curr)
            System.out.print(val);
            System.out.println();
            return;
        }

        for(int i=0; i<=1; i++)
        {
            curr[r] = i;
            findTotal(arr, arr.length, curr, r+1);
        }
    }

    public static int processSolution(int[] arr, int curr[])
    {
        int res = 0;
        for(int i=0; i<4; i++)
        {
            if(curr[i] == 1)
            {
                res+=arr[i];
            }
        }

        return res;
    }

    public static void main(String[] args)
    {
        int arr[] = {2, 4, 6, 10};
        int curr[] = new int[arr.length];
        findTotal(arr, arr.length, curr, 0);
    }
}
