package Medium;

import java.util.Arrays;

public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] horizon = new int[grid.length];
        int[] vertical = new int[grid.length];
        for (int i = 0; i < grid.length; i++){
            int max_horizon = 0;
            int max_vertical = 0;
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] > max_horizon) max_horizon = grid[i][j];
                if (grid[j][i] > max_vertical) max_vertical = grid[j][i];
            }
            horizon[i] = max_horizon;
            vertical[i] = max_vertical;
        }

        System.out.println(Arrays.toString(horizon));
        System.out.println(Arrays.toString(vertical));

        int[][] result = new int[horizon.length][vertical.length];
        int count = 0;
        for (int i = 0; i < horizon.length; i++){
            for (int j = 0; j < vertical.length; j++){
                if (horizon[i] <= vertical[j]) {
                    count += horizon[i] - grid[i][j];
                    System.out.println("horizon i = " + i +": " + count + " h = " + horizon[i] + " g = " + grid[i][j]);
                    result[i][j] = horizon[i];
                }
                else if (vertical[j] < horizon[i]) {
                    count += vertical[j] - grid[i][j];
                    result[i][j] = vertical[j];
                }
            }
        }

        System.out.println(Arrays.deepToString(result));
        return count;
    }

    public static void main(String[] args) {
        var ob = new MaxIncreaseToKeepCitySkyline();
        int[][] grid = {{57,86,30,56}, {59,60,83,95}, {83,37,38,98}, {15,39,56,86}};
        System.out.println(ob.maxIncreaseKeepingSkyline(grid));
    }
}
