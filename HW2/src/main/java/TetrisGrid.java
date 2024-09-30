// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;

    /**
     * Constructs a new instance with the given grid.
     * Does not make a copy.
     *
     * @param grid
     */
    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }


    /**
     * Does row-clearing on the grid (see handout).
     */
    public void clearRows() {
        for (int i = 0; i < grid.length; i++) {
            boolean check = true;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == false) {
                    check = false;
                }
            }
            if (check) {
                for (int k = 0; k < grid[i].length; k++) {
                    grid[i][k] = false;
                }
                for (int k = i; k > 0; k--) {
                    for (int l = 0; l < grid[k].length; l++) {
                        grid[k][l] = grid[k - 1][l];
                    }
                }
            }
        }
    }

    /**
     * Returns the internal 2d grid array.
     *
     * @return 2d grid array
     */
    boolean[][] getGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        return null;
    }
    
}