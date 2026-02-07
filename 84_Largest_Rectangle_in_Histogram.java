import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>(); // stores INDICES
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int currHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {

                int poppedIndex = stack.pop();          
                int height = heights[poppedIndex];     

                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = i - left - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
