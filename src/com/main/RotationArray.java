public class RotationArray
{
    public static void main(String args[])
    {
        System.out.println(find("sample", "plelam"));
    }

    public static int find(String word1, String word2)
    {
        int length = word1.length();
        char[] word1Arr = word1.toCharArray();
        for(int i=0; i<length; i++)
        {
            mirror(word1Arr, length-i);
            if(word2.equals(new String(word1Arr)))
            {
                return 1;
            }

            word1Arr = word1.toCharArray();
        }

        return -1;
    }


    static void mirror(char word1Array[], int offset)
    {
        int length = word1Array.length;
        reverse(word1Array, 0, offset-1);
        reverse(word1Array, offset, length-1);
        reverse(word1Array, 0, length-1);
    }


    static void reverse(char arr[], int start, int end)
    {
        char temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
