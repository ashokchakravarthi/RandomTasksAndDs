public class Fibonacci
{
    public static int calculate(int n)
    {
        if(n <= 0)
        {
            return 1;
        }

        int min1 = calculate(n-1);
        int min2 = calculate(n-2);
        int result = min1 + min2;
        return result;
    }

    public static void main(String args[])
    {
        System.out.println(calculate(5));
    }
}