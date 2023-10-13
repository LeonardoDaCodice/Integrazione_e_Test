package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private StringManipulator stringManipulator;

    @BeforeEach
    public void setUp() {
        stringManipulator = new StringManipulator();
    }

    @Nested
    @DisplayName("T1-Concatenate Tests")
    class ConcatenateTests {
        @Test
        @DisplayName("T1.1-Concatenate non-null strings")
        public void testConcatenateNonNullStrings() {
            assertEquals("Hello, World!", stringManipulator.concatenate("Hello, ", "World!"));
        }

        @Test
        @DisplayName("T1.2-Concatenate with a null string")
        public void testConcatenateWithNullString() {
            assertThrows(IllegalArgumentException.class, () -> {
                stringManipulator.concatenate(null, "World!");
            });

            assertThrows(IllegalArgumentException.class, () -> {
                stringManipulator.concatenate("Hello, ", null);
            });

            assertThrows(IllegalArgumentException.class, () -> {
                stringManipulator.concatenate(null, null);
            });
        }
    }


    @Nested
    @DisplayName("T2-Reverse Tests")
    class ReverseTests {

        @Test
        @DisplayName("T2.1-Reverse a non-null string")
        public void testReverseNonNullString() {
            assertEquals("dlroW", stringManipulator.reverse("World"));
        }

        @Test
        @DisplayName("T2.2-Reverse a null string")
        public void testReverseNullString() {
            assertThrows(IllegalArgumentException.class, () -> {
                stringManipulator.reverse(null);
            });
        }
    }

    @Nested
    @DisplayName("T3-IsPalindrome Tests")
    class IsPalindromeTests {

        @Test
        @DisplayName("T3.1-Check a palindrome string")
        public void testIsPalindromeWithPalindromeString() {
            assertTrue(stringManipulator.isPalindrome("level"));
            assertTrue(stringManipulator.isPalindrome("radar"));
        }

        @Test
        @DisplayName("T3.2-Check a non-palindrome string")
        public void testIsPalindromeWithNonPalindromeString() {
            assertFalse(stringManipulator.isPalindrome("hello"));
            assertFalse(stringManipulator.isPalindrome("Palindrome"));
        }

        @Test
        @DisplayName("T3.3-Check a null string")
        public void testIsPalindromeWithNullString() {
            assertThrows(IllegalArgumentException.class, () -> {
                stringManipulator.isPalindrome(null);
            });
        }
    }
}
