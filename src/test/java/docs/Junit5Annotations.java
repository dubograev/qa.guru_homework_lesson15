package docs;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5Annotations {

    @BeforeAll
    static void setup() {
        System.out.println("setup here");
    }

                @BeforeEach
                void each() {
                    System.out.println("    beforeEach here");
                }

                @BeforeEach
                void one_more() {
                    System.out.println("    beforeMoreEach here");
                }

                            @Test
                            @DisplayName("Some test")
                            void someTest() {
                                System.out.println("        someTest here");
                                assertTrue(true);
                            }

                            @Test
                            @DisplayName("Another test")
                            void anotherTest() {
                                System.out.println("        anotherTest here");
                                assertTrue(true);
                            }

                @AfterEach
                void after() {
                    System.out.println("    afterEach here");
                }

    @AfterAll
    static void shutDown() {
        System.out.println("shutdown here");
    }

//    setup here
//            beforeEach here
//            beforeMoreEach here
//                  anotherTest here
//            afterEach here

//            beforeEach here
//            beforeMoreEach here
//                  someTest here
//            afterEach here
//    shutdown here
}
