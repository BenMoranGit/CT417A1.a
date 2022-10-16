import org.example.CourseProgramme;
import org.example.Lecturer;
import org.example.Module;
import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class CourseTest {

    Student std1 = new Student("Bob Marley", 18, DateTime.parse("2000-12-13T21:39:45.618-08:00"), 19723725);
    Student std2 = new Student("Joe Blogs", 19, DateTime.parse("2000-12-14T21:39:45.618-08:00"), 19723726);
    /*LECTURES*/
    Lecturer l1 = new Lecturer("Eminem", 50, DateTime.parse("1980-12-13T21:39:45.618-08:00"), 123);
    /*Modules*/
    Module m1 = new Module("ECE301");
    Module m2 = new Module("ECE302");
    /*CourseProgramme*/
    CourseProgramme cp1 = new CourseProgramme("ECE", DateTime.parse("1022-09-01T09:00:00.618-08:00"), DateTime.parse("1022-12-21T09:00:00.618-08:00"));

    @Test
    public void testingName(){
        cp1.setCpName("ARTS");
        assertEquals("ARTS", cp1.getCpName());
    }

    @Test
    public void testingModules(){
        cp1.setModules(Arrays.asList(m1,m2));
        assertEquals(Arrays.asList(m1, m2), cp1.getModules());
    }

    @Test
    public void testingStudents(){
        cp1.setStudents(Arrays.asList(std1));
        assertEquals(Arrays.asList(std1), cp1.getStudents());
    }

    @Test
    public void testingStartDate(){
        cp1.setAFT(DateTime.parse("2000-12-14T21:39:45.618-08:00"));
        assertEquals(DateTime.parse("2000-12-14T21:39:45.618-08:00"), cp1.getAFT());
    }

    @Test
    public void testingEndDate(){
        cp1.setAST(DateTime.parse("2000-12-14T21:39:45.618-08:00"));
        assertEquals(DateTime.parse("2000-12-14T21:39:45.618-08:00"), cp1.getAST());
    }
}