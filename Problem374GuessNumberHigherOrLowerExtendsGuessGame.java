/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Problem374GuessNumberHigherOrLowerExtendsGuessGame {
    public int guessNumber(int n) {

        int low = 0;
        int high = n;

        int mid = 0;

        while (low <= high) {

            mid = low + (high-low) / 2;
            int guess = guess(mid);

            if (guess == 0)
                return mid;
            else if (guess == -1)
                high = mid - 1; // num is smaller than the mid
            else 
                low = mid + 1;  // num is larger than the mid

        }

        return -1;
        
    }
}
