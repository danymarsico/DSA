import java.util.*;
public class PalindromeNumber {
   public boolean isPalindrome(int x) {
       // Initially I check if the value of x is negative, if it is I return false as I can't be palindrome.
       if (x < 0) {
           return false;
       }
       /* I then convert the number to a char array(stored in the xToArray variable)
          and create a new variable(reversed) of the same length of xToArray.
          I also created an int variable(index) and initialized it at 0.
          This will be used as a pointed to move to the next index.
        */
       char[] xToArray = ("" + x).toCharArray();
       char[] reversed = new char[xToArray.length];
       int index = 0;

       /* Here it loops from the last index to the first of xToArray and sets the value of reversed[index](0 in the first iteration)
          to be equal to the value contained in xToArray[i](last digit of the number x).
          Then I increment the value in index by 1.
          This will keep looping until the first index of the array and will completely reverse the digits of x.
        */
       for (int i = xToArray.length - 1; i >= 0; i++) {
           reversed[index] = xToArray[i];
           index++;
       }

       // Finally I return the boolean value resulting from the comparison between the 2 arrays: xToArray and reversed.
       return Arrays.equals(xToArray, reversed);

   }
}
