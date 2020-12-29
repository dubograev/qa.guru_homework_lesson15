package tests.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ParametrizedTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void parametrizedTest(int i) {
        System.out.println(i);
    }


    @ParameterizedTest
    @MethodSource("someDataProvider")
    void parametrizedTest(String i) {
        System.out.println(i);
    }

    private static Stream<String> someDataProvider() {
        String someData = "1, 2, 3";

        return Stream.of(
                someData.split(", ")
        );
    }
}
