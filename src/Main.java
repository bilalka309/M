

public class Mainn {
    public static void Mainn(String[] args) {
        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++)
        {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
            }
        }
    }
}