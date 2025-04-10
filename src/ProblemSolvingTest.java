import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  //  - test a set where none start with A
  //  - test a set with only a single element
  //  - more you can think of!
  // Test that returns true for an empty set (vacuously true)
  @Test
  void testAllStartWithA_emptySet() {
    Set<String> input = Set.of();
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  // Test that returns false when none of the strings start with "A"
  @Test
  void testAllStartWithA_noneStartWithA() {
    Set<String> input = Set.of("banana", "cat", "dog");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertFalse(actual);
  }

  // Test that returns true for a single valid string
  @Test
  void testAllStartWithA_singleElement_true() {
    Set<String> input = Set.of("avocado");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  // Test that returns false for a single invalid string
  @Test
  void testAllStartWithA_singleElement_false() {
    Set<String> input = Set.of("banana");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertFalse(actual);
  }

  // Case-sensitive check that all words start with "A"/"a"
  @Test
  void testAllStartWithA_caseSensitivity() {
    Set<String> input = Set.of("apple", "Antelope", "Alligator");
    boolean actual = ProblemSolving.allStartWithA(input);
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!
// Test that returns true when all strings are empty
@Test
void testHasEmptyString_allEmpty() {
  Set<String> input = Set.of("", "", "");
  boolean actual = ProblemSolving.hasEmptyString(input);
  assertTrue(actual);
}

// Test that returns false for an empty set
@Test
void testHasEmptyString_emptySet() {
  Set<String> input = Set.of();
  boolean actual = ProblemSolving.hasEmptyString(input);
  assertFalse(actual);
}

// Test with only one empty string
@Test
void testHasEmptyString_onlyOneElementEmpty() {
  Set<String> input = Set.of("");
  boolean actual = ProblemSolving.hasEmptyString(input);
  assertTrue(actual);
}

  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test maxLength
  // Use your creativity here!

   // Single string length test
   @Test
   void testMaxLength_singleWord() {
     Set<String> input = Set.of("longword");
     int actual = ProblemSolving.maxLength(input);
     assertEquals(8, actual);
   }
 
   // All strings same length
   @Test
   void testMaxLength_equalLengthWords() {
     Set<String> input = Set.of("cat", "dog", "man");
     int actual = ProblemSolving.maxLength(input);
     assertEquals(3, actual);
   }
 
   // Includes empty string, but max comes from others
   @Test
   void testMaxLength_containsEmptyString() {
     Set<String> input = Set.of("", "alpha", "betamax");
     int actual = ProblemSolving.maxLength(input);
     assertEquals(7, actual);
   }
 
   // Empty set returns 0
   @Test
   void testMaxLength_emptySet() {
     Set<String> input = Set.of();
     int actual = ProblemSolving.maxLength(input);
     assertEquals(0, actual);
   }
    
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

}