public class Divider
{
    public static void main(String [] srgs)
    {

        int half = 233;
        boolean flag = false;
        while (half > 0)
        {
            flag = (half%10 == 4);
            System.out.println(half%10);
            half = half/10;
            //System.out.println(half);

        }


        System.out.println(flag);

    }
}
