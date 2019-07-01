import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class SongDuration
{
    public static void main(String args[])
    {
        ArrayList songDurations = new ArrayList();
        songDurations.add(100);
        songDurations.add(180);
        songDurations.add(40);
        songDurations.add(120);
        songDurations.add(10);
        System.out.println(idsOfSongs(220, songDurations));
    }

    /*static ArrayList<Integer> idsOfSongs(int rideDuration, ArrayList<Integer> songDurations)
    {
        rideDuration = rideDuration - 30;
        int start=0, end= songDurations.size()-1;
        while (start < end)
        {
            if(songDurations.get(start) + songDurations.get(end) == rideDuration)
            {
                ArrayList ids = new ArrayList<Integer>();
                ids.add(start);
                ids.add(end);
                return ids;
            }
            else if(songDurations.get(start) + songDurations.get(end) < rideDuration)
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        return null;
    }*/

    static ArrayList<Integer> idsOfSongs(int rideDuration, ArrayList<Integer> songDurations)
    {
        ArrayList sum =new ArrayList<Integer>();
        ArrayList result = new ArrayList<Integer>();
        for(int i=0; i<songDurations.size(); i++)
        {
            Integer temp = rideDuration-songDurations.get(i);
            if(sum.contains(temp))
            {
                if(result.size() > 1 && ((Integer)result.get(0) > temp || (Integer) result.get(1) > songDurations.get(i)))
                {
                    result.add(0, sum.indexOf(temp));
                    result.add(1, i);
                }
                else if(result.size() == 0)
                {
                    result.add(sum.indexOf(temp));
                    result.add(i);
                }
            }

            sum.add(songDurations.get(i));
        }

        return result;
    }
}
