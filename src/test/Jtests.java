package gradebook;
import static org.junit.Assert.*;
import org.junit.Test;

public class Jtests {

    @Test
    public void testStudentName() {
        Student tmp = new Student();
        tmp.addStudent();
        assertEquals(tmp.name, "James Garfield");
    }

}

