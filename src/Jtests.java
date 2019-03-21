package gradebook;
import static org.junit.Assert.*;
import org.junit.Test;

public class MyTests {

    @Test
    public void testStudentName() {
        Student Joe = new Student(); // MyClass is tested
        assertEquals(Joe.courseList == 0);
    }

    @Test
    public void testResponse() {
        string response = "F";
        assertFalse(validresponse);
        string resp = "A";
        assertTrue(validresponse);
    }
}

