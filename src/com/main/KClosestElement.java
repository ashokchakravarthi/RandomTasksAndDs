public class KClosestElement
{
    public static void main(String args[])
    {
        int array[] = new int[]{2,4,6,22,3,32,9,14,20,15,14,18,10};
        find(array,9, 3);

    }

    static void find(int[] array, int x, int k)
    {
        int closest[] = new int[k];
        for(int i=0;i<k-1; i++)
        {
            closest[i] = array[i];
        }
        for(int i=k; i<array.length-1;i++)
        {
            int diff = array[i] - x;
            if(Math.abs(diff)< closest[i])
            {
              closest[i] = array[i];
            }

        }
    }
}
