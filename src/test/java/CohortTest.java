import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    @Test
    public void testAddStudent(){
        Student gage = new Student(47L, "Gage Jackson");
        Cohort azeban = new Cohort();
        azeban.addStudent(gage);

        assertEquals(1, azeban.getStudents().size());
        assertTrue(azeban.getStudents().contains(gage));
    }

    @Test
    public void testGetCohortStudentList(){
        Student gage = new Student(47L, "Gage Jackson");
        gage.addGrade(100);
        gage.addGrade(100);
        gage.addGrade(100);

        Student hubert = new Student(23L, "Hubert Lowry");
        hubert.addGrade(90);
        hubert.addGrade(90);
        hubert.addGrade(90);

        Student jenny = new Student(14L, "Jenny McSomething");
        jenny.addGrade(80);
        jenny.addGrade(80);
        jenny.addGrade(80);

        Cohort azeban = new Cohort();

        azeban.addStudent(gage);
        azeban.addStudent(hubert);
        azeban.addStudent(jenny);

        assertEquals(90, azeban.getCohortAverage(), 0);
    }

    @Test
    public void testGetCohortGradeAverage(){

    }
}
