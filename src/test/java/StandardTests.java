import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class StandardTests {
    private int initTimes = 0;

    @BeforeAll
    //if beforeAll method is not declared as static,main class must annotated with @TestInstance(Lifecycle.PER_CLASS)
    static void initAll() {
        System.out.println("before all");

    }

    @BeforeEach
    void init() {
        System.out.println("before each" + (++initTimes));
    }

    @Test
    void succeedingTest() {
        System.out.println("empty test");
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        System.out.println("skippedTest");
        // not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll");
    }

}