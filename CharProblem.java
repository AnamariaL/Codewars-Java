package pract;
/*Description:
Ask a small girl - "How old are you?". She always says strange things...
 Lets help her!

For correct answer program should return int from 0 to 9.

Assume test input string always valid and may look like "1 year old" 
or "5 years old", etc.. The first char is number only.*/
public class CharProblem {
  public static int howOld(final String herOld) {
 // int x = Character.getNumericValue(herOld.charAt(0));
  return Character.getNumericValue(herOld.charAt(0));
  
  }
}