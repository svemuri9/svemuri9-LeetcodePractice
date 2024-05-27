class Solution {
    public void setZeroes(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;

        int colu = 1;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;

                    if (col != 0) {
                        matrix[0][col] = 0;
                    } else {
                        colu = 0;
                    }
                }
            }
        }

        for (int col = 1; col < width; col++) {
            for (int row = 1; row < height; row++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int col = 0; col < width; col++) {
                matrix[0][col] = 0;
            }
        }

        if (colu == 0) {
            for (int row = 0; row < height; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}