class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int count = 1;

        while (top <= bottom && left <= right) {

            // 1. left to right 
            for (int j = left; j <= right; j++) {
                matrix[top][j] = count;
                count++;
            }
            top++;

             // 2. top to bottom 
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;
            }
            right--;

            if (top <= bottom) {

             // 3. bottom to left 
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = count;
                    count++;
                }
                bottom--;
            }

            if (left <= right) {

                // 4. bottom to top 
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count;
                    count++;
                }
                left++;
            }
        }

        return matrix;
    }
}
