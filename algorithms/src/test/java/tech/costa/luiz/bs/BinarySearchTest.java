package tech.costa.luiz.bs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * The type Binary search test.
 */
class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    /**
     * Numbers provider stream.
     *
     * @return the stream
     */
    static Stream<Arguments> numbersProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{0, 3, 5, 6, 99}, 3, 1),
                Arguments.arguments(new int[]{82, 86, 90, 94, 98}, 94, 3),
                Arguments.arguments(new int[]{99, 100, 105, 106, 500}, 50, -1),
                Arguments.arguments(new int[]{2000, 2010, 2020, 2030, 2040}, 2040, 4)
        );
    }

    /**
     * Find element index.
     *
     * @param numbers       the numbers
     * @param numberToFind  the number to find
     * @param expectedIndex the expected index
     */
    @ParameterizedTest(name = "binarySearch for {0} to find element {1} at index {2}")
    @MethodSource("numbersProvider")
    void findElementIndex(int[] numbers, int numberToFind, int expectedIndex) {
        assertThat(binarySearch.search(numbers, numberToFind), is(equalTo(expectedIndex)));
    }
}