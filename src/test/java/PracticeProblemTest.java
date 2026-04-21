import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.lang.reflect.Method;

class PracticeProblemTest {

   // --- addString() Tests ---

   @Test
   @DisplayName("addString: Should add string to the middle of an array")
   void addStringTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class, int.class };
         Method method = testClass.getDeclaredMethod("addString", cArg);
         String[] inputArr = {"apple", "banana", "cherry"};
         String[] expected = {"apple", "orange", "banana", "cherry"};
         assertArrayEquals(expected, (String[]) method.invoke(null, inputArr, "orange", 1));
      } catch (NoSuchMethodException e) {
         fail("Method addString does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("addString: Should add string to the beginning (index 0)")
   void addStringTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class, int.class };
         Method method = testClass.getDeclaredMethod("addString", cArg);
         String[] inputArr = {"A", "B"};
         String[] expected = {"Start", "A", "B"};
         assertArrayEquals(expected, (String[]) method.invoke(null, inputArr, "Start", 0));
      } catch (Exception e) {
         fail("Execution failed: " + e);
      }
   }

   @Test
   @DisplayName("addString: Should add string to the very end")
   void addStringTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class, int.class };
         Method method = testClass.getDeclaredMethod("addString", cArg);
         String[] inputArr = {"First"};
         String[] expected = {"First", "Last"};
         assertArrayEquals(expected, (String[]) method.invoke(null, inputArr, "Last", 1));
      } catch (Exception e) {
         fail("Execution failed: " + e);
      }
   }

   @Test
   @DisplayName("addString: Should handle an empty initial array")
   void addStringTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String[].class, String.class, int.class };
         Method method = testClass.getDeclaredMethod("addString", cArg);
         String[] inputArr = {};
         String[] expected = {"New"};
         assertArrayEquals(expected, (String[]) method.invoke(null, inputArr, "New", 0));
      } catch (Exception e) {
         fail("Execution failed: " + e);
      }
   }

   // --- removeChars() Tests ---

   @Test
   @DisplayName("removeChars: Should remove multiple instances of a character")
   void removeCharsTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("removeChars", cArg);
         char[] inputArr = {'a', 'b', 'a', 'c', 'a'};
         char[] expected = {'b', 'c'};
         assertArrayEquals(expected, (char[]) method.invoke(null, inputArr, 'a'));
      } catch (NoSuchMethodException e) {
         fail("Method removeChars does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("removeChars: Should return same array if character is not present")
   void removeCharsTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("removeChars", cArg);
         char[] inputArr = {'x', 'y', 'z'};
         char[] expected = {'x', 'y', 'z'};
         assertArrayEquals(expected, (char[]) method.invoke(null, inputArr, 'a'));
      } catch (Exception e) {
         fail("Execution failed: " + e);
      }
   }

   @Test
   @DisplayName("removeChars: Should result in empty array if all characters match")
   void removeCharsTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("removeChars", cArg);
         char[] inputArr = {'b', 'b', 'b'};
         char[] expected = {};
         assertArrayEquals(expected, (char[]) method.invoke(null, inputArr, 'b'));
      } catch (Exception e) {
         fail("Execution failed: " + e);
      }
   }

   @Test
   @DisplayName("removeChars: Should handle an empty input array")
   void removeCharsTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char[].class, char.class };
         Method method = testClass.getDeclaredMethod("removeChars", cArg);
         char[] inputArr = {};
         char[] expected = {};
         assertArrayEquals(expected, (char[]) method.invoke(null, inputArr, 'z'));
      } catch (Exception e) {
         fail("Execution failed: " + e);
      }
   }
}
