Sol: using regular binary Search.
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid);

            if (result == 0) return mid;      
            else if (result == -1) end = mid - 1; 
            else start = mid + 1;               
        }

        return -1; 
    }
}

Sol: Using recursion.
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return search(1, n);
    }

    public int search(int s, int e) {
        int mid = s + (e - s) / 2;

        int result = guess(mid);

        if (result == 0) {
            return mid;
        }

        else if (result == -1) {
            return search(s, mid - 1);
        }

        return search(mid + 1, e);
    }
}

