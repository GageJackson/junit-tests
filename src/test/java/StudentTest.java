import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void testGetName(){
        Student gage = new Student(47L, "Gage Jackson");
        assertEquals("Gage Jackson", gage.getName());
    }

    @Test
    public void testGetId(){
        Student gage = new Student(47L, "Gage Jackson");
        assertEquals(47L, gage.getId());
    }

//    @Test
//    public void testGetGrades(){
//        Student gage = new Student(47L, "Gage Jackson");
//        gage.addGrade(90);
//        gage.addGrade(95);
//        gage.addGrade(100);
//        assertEquals(([90, 95, 100]), gage.getGrades());
//    }
}
