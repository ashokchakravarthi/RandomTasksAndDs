public class RowWithMax1s
{
    static void rowWithMax1s(int arr[][])
    {
        // Initialize first row as row with max 1s
        int maxRowIndex = 0;
        int m = arr.length;
        int n = arr[0].length;
        // The below returns index of first 1 in row 0.  Use this index to initialize the index of leftmost 1 seen so far
        int j = -1;
        for(int i=0; i < n; i++)
        {
            if(arr[0][i] == 1)
                j=i;
        }

        if (j == -1) // if 1 is not present in first row
            j = n - 1;

        for (int i = 1; i < m; i++)
        {
            // Move left until a 0 is found
            while (j >= 0 && arr[i][j] == 1)
            {
                j = j-1;  // Update the index of leftmost 1 seen so far
                maxRowIndex = i;  // Update max_row_index
            }
        }

        System.out.println(maxRowIndex);
    }

    public static void main(String args[])
    {
        int arr[][] = {
                            {0,0,1,1},
                            {0,1,1,1},
                            {1,1,1,1},
                            {0,0,0,0},
                            {0,1,1,1}
                        };
        rowWithMax1s(arr);
    }
}
