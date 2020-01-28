public class Compressor1
{
    static char[] compress(char[] str,int len, int act)
    {
        int length = str.length-1;
        if(len < length)
        {
            int k=len;
            int count=0;
            int c, n;
            while(str[k] == str[len])
            {
                len++;
                count++;
            }

            n = 0;
            c = count;
            do
            {
                c /= 10;
                n++;
            } while (c != 0);

            compress(str,len,act+n+1);
            str[act]=str[k];
            if(k+count==length)
                str[act+n+1]='\0';

            for(c=0;c<n;c++)
            {
                str[act+n-c] = (char) ((count%10)+48);
                count=count/10;
            }
        }

        return str;
    }

    public static void main(String[] arg)
    {
        String str ="aabbbceeeef";
        System.out.println(compress(str.toCharArray(), 0, 0));
    }
}
