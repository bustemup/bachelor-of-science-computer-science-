package firstsubroutines;

/* PALINDROME TEST:
 * This Java program will ask for input of a 
 * word, phrase, or sentence, (with punctuation
 * or without) format the input, reverse it,
 * and then determine whether or not it is a 
 * palindrome (word or phrase spelled the same
 * forwards as it is backwards).
 */
class Firstsubroutines {
  /* Main method is where the total text input and 
   * output occurs. It also checks to see if the original
   * phrase and the formatted/reversed phrase are the same,
   * as well as calling subroutines to format and reverse
   * the phrase.
   */
  public static void main(String[] args) {
    
    // Variable declaration
    String phrase;
    String formattedPhrase;
    String flippedString;
    String again;
    
    do {
    System.out.println("\nPlease enter a word, phrase, or sentence.");
    System.out.println("This will first be formatted, then tested");
    System.out.println("to see if it is a palindrome.");
    phrase = TextIO.getln();
    
    formattedPhrase = formatString(phrase);
    TextIO.putln("\nThe phrase, after formatting, is: " + formattedPhrase);
    
    flippedString = flipString(formattedPhrase);
    TextIO.putln("\nThe reverse of the formatted phrase is: " + flippedString);
    
    if (!flippedString.equals(formattedPhrase)) {
        TextIO.putln("\nThe phrase you entered is not a palindrome.");
    } // end of if/else statements
 else {
        TextIO.putln("\nThe phrase you entered is a palindrome.");
    }
    
    TextIO.putln("\nWould you like to try again? (y/n)");
    again = TextIO.getln();
    
    } while (again.equals("y") || again.equals("yes"));
  } // end main method
  
  /*
  formatString converts the text to lower case then removes
  all non-alphabetical characters and spaces.
  */
  public static String formatString (String stringUnformatted) {
    // Convert string to lower case
    stringUnformatted = stringUnformatted.toLowerCase();
    
    // Remove all non-alphabetical characters
    String forward;
    int j;
    forward = "";
    // Loop through characters in unformatted string
    for (j = 0; j <= stringUnformatted.length() - 1; j++) {
      // Test to see if characters are letters and add letters
      if (stringUnformatted.charAt(j) >= 'a' && stringUnformatted.charAt(j) <= 'z') {
        forward = forward + stringUnformatted.charAt(j);
      } // end "if" statement
    } // end "for" loop
    
    String stringFixed;
    stringFixed = forward;
    return stringFixed;
  } // end formatString
  
  /* 
  flipString takes the formatted string and reverses the
  characters, returning "stringFlipped".
  */
  public static String flipString(String stringFormatted) {
    
    String reverse;
    int i;
    reverse = "";
    for (i = stringFormatted.length() - 1; i >= 0; i--) {
   	  reverse = reverse + stringFormatted.charAt(i);
    } // end for loop to reverse characters
    
    String stringFlipped;
    stringFlipped = reverse;
    return stringFlipped;

  } // end subroutine flipString
  
} // end class firstsubroutines

