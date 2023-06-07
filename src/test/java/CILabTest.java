import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

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
        assertTrue(myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUse_AllCapitals_ReturnsTrue(){
        myString.setString("queenOfTheWorld");
    }


    @Test
    public void detectCapitalUse_OnlyFistLetterCapital_ReturnsTrue(){
        myString.setString("Yahoo");
        assertTrue(myString.detectCapitalUse());
    }


}
