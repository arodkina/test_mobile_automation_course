import org.automationCourse.MainClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainClassTest {

    private static final int EXPECTED_LOCAL_NUMBER = 14;

    @Test
    public void testGetLocalNumber() {
        assertEquals("Method getLocalNumber() returned unexpected value", EXPECTED_LOCAL_NUMBER, MainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        assertTrue("Method getClassNumber() returned unexpected value, expected > 45,  but was < 45", MainClass.getClassNumber() > 45);
    }
}
