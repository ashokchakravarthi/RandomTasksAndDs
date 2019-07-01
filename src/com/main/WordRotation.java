public class WordRotation
{
    public static void main(String args[])
    {
        System.out.println(wordRotationMehod("sample", "plesam"));
    }

    public static int wordRotationMehod(String word1, String word2)
    {
        char[] word1Char = word1.toCharArray();
        int n = word1.length()-1;
        if(n != word2.length()-1)
        {
            return -1;
        }

        char temp = word1Char[0];
        for(int i=0; i<=n; i++)
        {
            if(i==n)
            {
                word1Char[n] = temp;

                if(word1Char.toString().equals(word2))
                {
                    return 1;
                }
            }
            else
            {
                word1Char[i] = word1Char[i+1];
            }
        }

        return -1;
    }
}
