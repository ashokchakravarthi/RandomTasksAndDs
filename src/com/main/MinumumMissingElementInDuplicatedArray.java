public class MinumumMissingElementInDuplicatedArray
{
    public static void main(String[] args)
    {
        int[] array = {1,3,6,2,7,3,5,8,1,7};
        getMissingNumber(array);
    }

    public static void getMissingNumber(int [] array)
    {
        int n = array.length;
        int register[] = new int[n-1];
        for(int i=0; i<n; i++)
        {
            register[array[i]] = 1;
        }

        for(int i=1;i<n-1;i++)
        {
            if(register[i] == 0)
            System.out.println(i);
        }
    }
}
