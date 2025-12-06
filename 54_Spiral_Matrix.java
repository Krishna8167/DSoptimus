class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {
            
            // 1. left to right
            for (int j = left ; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            
            // 2. right to bottom
            for (int i = top ; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

           if (top <= bottom) {
            // 3. bottom to left
            for (int j = right ; j >= left; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--;
           }
            
            if ( left <= right ) {
            // 4. left to top
            for (int i = bottom ; i >= top; i--) {
                result.add(matrix[i][left]);
                }
            left++;
            }
        }
        return result;
    }
}
