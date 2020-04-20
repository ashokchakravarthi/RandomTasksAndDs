import java.util.ArrayList;
import java.util.List;

public class FindIsland1
{
    static Integer[][] array;
    static int count = 0, rowLimit, columnLimit;
    static int numberAmazonGoStores(int rows, int column, List<List<Integer>> grid)
    {
        array = new Integer[grid.size()][];
        for (int i = 0; i < grid.size(); i++)
        {
            List<Integer> row = grid.get(i);
            array[i] = row.toArray(new Integer[row.size()]);
        }

        rowLimit = rows-1;
        columnLimit = column-1;
        findClusters(0,0);
        return count;
    }

    static void findClusters(int row, int column)
    {
        if(row > rowLimit || column > columnLimit)
        {
            return;
        }

        if(array[row][column] == 1)
        {
            array[row][column] = 0;
            if(row+1 <= rowLimit)
            {
                array[row+1][column] = 0;
            }

            if(column+1 <= columnLimit)
            {
                array[row][column+1] = 0;
            }

            if(row-1 >= 0)
            {
                array[row-1][column] = 0;
            }

            if(column-1 >= 0)
            {
                array[row][column-1] = 0;
            }
            findClusters(row, column+1);
            findClusters(row+1, column);

            count++;
        }

        findClusters(row, column+1);
        findClusters(row+1, column);
    }


    // Driver method
    public static void main(String[] args) throws java.lang.Exception
    {
        List<List<Integer>> matrix= new ArrayList<List<Integer>>();
        List<Integer> element= new ArrayList<Integer>();
        element.add(1);
        element.add(1);
        element.add(0);
        element.add(0);
        matrix.add(element);
        element= new ArrayList<Integer>();
        element.add(0);
        element.add(0);
        element.add(1);
        element.add(0);
        matrix.add(element);
        element= new ArrayList<Integer>();
        element.add(0);
        element.add(0);
        element.add(0);
        element.add(0);
        matrix.add(element);
        element= new ArrayList<Integer>();
        element.add(1);
        element.add(0);
        element.add(1);
        element.add(1);
        matrix.add(element);
        element= new ArrayList<Integer>();
        element.add(1);
        element.add(1);
        element.add(1);
        element.add(1);
        matrix.add(element);
        System.out.println(numberAmazonGoStores(5, 4, matrix));
    }
}
