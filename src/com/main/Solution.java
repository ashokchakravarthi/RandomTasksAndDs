import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(reader.readLine());
        Integer startingCase = 1;
        while (cases > 0)
        {
            Integer number = Integer.parseInt(reader.readLine());
            Integer half = number/2;
            Integer otherHalf = half;
            if(number%2 == 1)
            {
                half++;
            }

            while(half<number)
            {
                if(containsFour(half, otherHalf))
                {
                    half++;
                    otherHalf--;
                }
                else
                {
                    System.out.println("Case #"+startingCase+": "+half +" " + otherHalf);
                    break;
                }
            }

            cases--;
            startingCase++;
        }

    }

    private static boolean containsFour(Integer half, Integer otherHalf)
    {
        boolean flag = false;
        while (half > 0)
        {
            flag = (half%10 == 4);
            if(flag)
            {
                return true;
            }
            half = half/10;
        }

        while (otherHalf > 0)
        {
            flag = (otherHalf%10 == 4);
            if(flag)
            {
                return true;
            }
            otherHalf = otherHalf/10;
        }


        return false;
    }
}
