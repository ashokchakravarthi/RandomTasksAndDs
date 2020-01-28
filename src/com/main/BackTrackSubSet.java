import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTrackSubSet
{
    static List<List<Integer>> res = new ArrayList<>();

    public static void processSolution(int[] arr, int[] curr)
    {
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(curr[i]==1)
            {
                temp.add(arr[i]);
            }
        }

        res.add(temp);
    }

    public static  List<List<Integer>> backTrack(int[] arr, int n, int[] curr, int k)
    {
        if(k==n)
        {
            processSolution(arr, curr);
        }
        else
        {
            for(int i=0; i<=1; i++)
            {
                curr[k]=i;
                for(int val: curr)
                System.out.print(val);
                System.out.println();
                backTrack(arr, n, curr, k+1);
            }
        }

        return res;
    }

    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 10};
        int curr[] = new int[arr.length];
        System.out.println(backTrack(arr, arr.length, curr, 0));
    }
}

