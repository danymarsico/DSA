public class PalindromeNumber2 {

    public boolean isPalindromeNumber2(int x) {

        // Initially I check if the value of x is negative, if it is I return false as I can't be palindrome.
        if (x < 0) {
            return false;
        }

        /* Then I declare 2 variables, 'temp' that saves the value of x and reversed that will be the reversed value and that we
         initialize at 0 */
        int temp = x;
        int reversed = 0;

        /* The logic I applied to solve it without converting to a char[] or String was to basically obtain the last digit from the 'temp'
          by getting the remainder from the division by 10(using the modulo operator) and then append it to the current value of 'reversed'.
          Meanwhile, 'reversed' will be updated at each iteration to be multiplied by 10 in order to move the unit type(tens, hundreds, thousands, etc)
          and be summed to the newly found 'lastDigit'.
          Finally, I update the value of 'temp' to decrease by 1 order(...thousands, hundreds, tens).
          And I keep repeating until the value of 'temp' equals 0 */
        while(temp != 0) {

            int lastDigit = temp % 10;
            reversed = (reversed * 10) + lastDigit;
            temp = temp/10;

        }

        //Finally I return the boolean resulting from the comparison between x and reversed
        return (x == reversed);

    }




}
