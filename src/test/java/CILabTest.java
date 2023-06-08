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
        assertTrue(myString.detectCapitalUse(), "Failed for 'USA'");
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse(), "Failed for 'leetcode'");
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse(), "Failed for 'Google'");
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("OpenAI");
        assertTrue(myString.detectCapitalUse(), "Failed for 'OpenAI'");
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("Hello");
        assertFalse(myString.detectCapitalUse(), "Failed for 'Hello'");
    }

    @Test
    public void detectCapitalUseTest6() {
        myString.setString("WORLD");
        assertFalse(myString.detectCapitalUse(), "Failed for 'WORLD'");
    }
}
