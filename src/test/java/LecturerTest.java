import org.example.CourseProgramme;
import org.example.Lecturer;
import org.example.Module;
import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class LecturerTest {

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
    public void testingAgeNameUserName() {
        l1.setlAge(10);
        l1.setlName("John");
        assertEquals("John", l1.getlName());
        assertEquals("John10", l1.getlUsername());
        assertEquals(10, l1.getlAge());
    }

    @Test
    public void testingDOB(){
        l1.setlDOB(DateTime.parse("2000-12-14T21:39:45.618-08:00"));
        assertEquals(DateTime.parse("2000-12-14T21:39:45.618-08:00"), l1.getlDOB());
    }

    @Test
    public void testingID(){
        l1.setlID(196);
        assertEquals(196, l1.getlID());
    }

    @Test
    public void testingModules(){
        l1.setlModules(Arrays.asList(m1, m2));
        assertEquals(Arrays.asList(m1, m2), l1.getlModules());
    }


}
