public class Factorial
{
    public static int factorial(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            int result = n * factorial(n-1);
            return result;
        }
    }

    public static void main(String[] args)
    {
        int result = factorial(5);
        System.out.println(result);
    }
}