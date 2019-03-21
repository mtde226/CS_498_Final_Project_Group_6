package gradebook;
import static org.junit.Assert.*;
import org.junit.Test;

public class Jtests {

    @Test
    public void testStudentName() {
        Student Joe = new Student(); // MyClass is tested
        assertEquals(Joe.courseList.size(), 0);
    }

}

