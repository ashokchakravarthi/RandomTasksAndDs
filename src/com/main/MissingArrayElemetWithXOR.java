public class MissingArrayElemetWithXOR
{
    public static void main(String[] args)
    {
        int[] array = {1,3,6,2,7,5,8,9};
        System.out.println(getMissingNumber(array, 8));
    }

    public static int getMissingNumber(int [] array, int size)
    {
        int i, xorResult = 0, n = size + 1;
        /* Take the xor of all numbers between 1 to n */
        for(i = 1; i <= n; i++){
            xorResult = xorResult ^ i;
        }
        /* Take the xor of all array elements */
        for(i = 0; i < size; i++){
            xorResult = xorResult ^ array[i];
        }

        return xorResult;
    }
}
