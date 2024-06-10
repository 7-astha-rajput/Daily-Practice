
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
        int low = 1;
        int high = n;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            
            int result = guess(mid);
            if (result == 0) {
                return mid; // Found the picked number
            } else if (result == -1) {
                high = mid - 1; // Guess is too high
            } else {
                low = mid + 1; // Guess is too low
            }
        }
        
        return -1; // This line should never be reached
    }
}
