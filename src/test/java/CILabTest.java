import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse(), "Expected true");

        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse(), "Expected true");

        myString.setString("Google");
        assertTrue(myString.detectCapitalUse(), "Expected true");
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Hello");
        assertTrue(myString.detectCapitalUse(), "Expected true");

        myString.setString("WORLD");
        assertTrue(myString.detectCapitalUse(), "Expected true");

        myString.setString("OpenAI");
        assertFalse(myString.detectCapitalUse(), "Expected false");
    }
}
