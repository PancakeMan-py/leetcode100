import java.util.ArrayList;

public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] grid = new int[n][n];
        int layer = n-1;
        int i = 0;
        int j = 0;
        int index = 0;

        while (layer > 0){
            //up
            grid[i][j] = index;
            index++;
            j++;
        }

        //0,0 0,1 0,2
        //1,0 1,1 1,2
        //2,0 2,1 2,2
        return grid;
    }
}
