class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows > s.length()) {
            return s;
        }

        int len = s.length();
        int cyclelen = 2 * numRows - 2;
        int cycles = (len + cyclelen - 1) / cyclelen;
        int cols = cycles * (numRows - 1) + 1;

        char[][] matrix = new char[numRows][cols];

        int rows = 0, col = 0;
        boolean goesdown = true;

        for(int i = 0; i < len; i++) {

            matrix[rows][col] = s.charAt(i);

            if(goesdown) {
                if(rows == numRows - 1) {
                    goesdown = false;
                    rows--;
                    col++;
                } else {
                    rows++;
                }
            }
            else{
                if (rows == 0) {
                    goesdown = true;
                    rows++;
                }
                else {
                    rows--;
                    col++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] != 0) sb.append(matrix[r][c]);
            }
        }

        return sb.toString();
    }
}
