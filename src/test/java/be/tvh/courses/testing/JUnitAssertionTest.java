package be.tvh.courses.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;

import static java.time.Duration.ofSeconds;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test that demonstrate the different assertions available within JUnit 5
 */
@DisplayName("Test case for assertions")
public class JUnitAssertionTest {

    @Test
    @DisplayName("The area of two polygons should be equal")
    public void AssertSomethingIsEqual() {
        float square = 2 * 2;
        float rectangle = 2 * 2;

    }

    @Test
    public void AssertSomethingIsEqualWithDelta() {
        float square = 2 * 2;
        float rectangle = 3 * 2;
        float delta = 2;

    }

    @Test
    @DisplayName("Arrays should be equals")
    public void AssertArraysAreEqual() {
        char[] expected = {'J', 'u', 'p', 'i', 't', 'e', 'r'};
        char[] actual = "Jupiter".toCharArray();

    }

    @Test
    public void AssertSomethingIsNull() {
        Object cat = null;

    }

    @Test
    public void AssertSomethingIsNotNull() {
        Object dog = new Object();

    }

    @Test
    public void AssertObjectsAreTheSameObject() {
        String language = "Java";
        Optional<String> optional = Optional.of(language);

    }

    @Test
    public void AssertValueOfLambda() {
        BooleanSupplier condition = () -> 5 > 6;

    }

    @Test
    @Disabled
    public void FailingATest_thenFailed() {
        // Test not completed
        fail("FAIL - test not completed");
    }

    @Test
    public void AssertEverything() {
        assertEquals(4, 2 * 2, "4 is 2 times 2");
        assertEquals("java", "JAVA");
        assertEquals(null, 1, "null is equal to null");
    }

    @Test
    public void assertEqualIterables() {
        Iterable<String> al = new ArrayList<>(asList("Java", "Junit", "Test"));
        Iterable<String> ll = new LinkedList<>(asList("Java", "Junit", "Test"));

    }

    @Test
    public void assertNoTimeout() throws InterruptedException {
            // code that requires less then 2 minutes to execute
            Thread.sleep(1000);
    }

    @Test
    public void AssertingEquality_thenNotEqual() {
        Integer value = 5; // result of an algorithm

    }

    @Test
    public void AssertingEqualityListOfStrings_thenEqual() {
        List<String> expected = asList("Java", "\\d+", "JUnit");
        List<String> actual = asList("Java", "11", "JUnit");

        assertLinesMatch(expected, actual);
    }

    @Test
    void AssertingException_thenThrown() {
//        new IllegalArgumentException("Exception message");

//        assertEquals("Exception message", exception.getMessage());
    }

}
