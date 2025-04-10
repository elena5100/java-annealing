import java.util.Set;

public class ProblemSolving {

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   */

     /**
*Verify that each word in the set begins with "A" or "a".
*True if the set is empty or consists of only empty strings.
*Empty strings are not starting with 'A', which leads to a false positive. 
*/
  public static boolean allStartWithA(Set<String> words) {
    for (String word : words) {
      if (word.isEmpty() || !(word.startsWith("A") || word.startsWith("a"))) {
        return false;
      }
    }
    return true;
  }


  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */

   /**
   * Checks if there's at least one empty word in the set.
   * Returns false if the set is empty.
   */
  public static boolean hasEmptyString(Set<String> words) {
    for (String word : words) {
      if (word.isEmpty()) {
        return true;
      }
    }
    return false;
  }


  /**
   * Returns the length of the longest word in the set.
   * 
   * Edge case: If the set is empty, return 0
   * 
   * @param words a set of words
   * @return the maximum length of a word in the set
   */

   /**
   * Finds the number of letters in the longest word.
   * Returns 0 if the set is empty.
   */
  public static int maxLength(Set<String> words) {
    int longest = 0;
    for (String word : words) {
      if (word.length() > longest) {
        longest = word.length();
      }
    }
    return longest;
  }


 /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */

   /**
   * Finds the number of letters in the shortest word.
   * Returns Integer.MAX_VALUE if the set is empty.
   */
  public static int minLength(Set<String> words) {
    if (words.isEmpty()) {
      return Integer.MAX_VALUE;
    }

    int shortest = Integer.MAX_VALUE;
    for (String word : words) {
      if (word.length() < shortest) {
        shortest = word.length();
      }
    }
    return shortest;
  }
}
