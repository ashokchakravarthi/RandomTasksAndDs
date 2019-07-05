import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HighestProductInArray
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int limit = Integer.parseInt(br.readLine());
        String array = br.readLine();
        String[] arrayElements = array.split(" ");
        if (limit < 3)
        {
            System.out.println(-1);
        }

        findMaximumOfproduct(arrayElements, limit);
    }

    static void findMaximumOfproduct(String arrayElements[], int limit)
    {
        int[] arrayElementsInt = new int[limit];
        for(int i=0; i<limit; i++)
        {
            arrayElementsInt[i] = Integer.parseInt(arrayElements[i]);
        }

        Arrays.sort(arrayElementsInt);
        int firstProduct = arrayElementsInt[0] * arrayElementsInt[1] * arrayElementsInt[2];
        int lastProduct = arrayElementsInt[limit-1]* arrayElementsInt[limit-2] * arrayElementsInt[limit-3];
        System.out.println( (firstProduct > lastProduct) ? firstProduct : lastProduct);
    }
}
