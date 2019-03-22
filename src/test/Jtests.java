package gradebook;
import static org.junit.Assert.*;
import org.junit.Test;

public class Jtests {

    //test completeTask()
    @Test
    public void testStudentName() {
        Task tmp = new Task();
        tmp.completeTask();
        assertEquals(tmp.completed, true);
    }

}

