import org.example.CourseProgramme;
import org.example.Lecturer;
import org.example.Module;
import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class JUnitA1 {

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
    public void addingModulesToStudent() {
        std1.setModules(Arrays.asList(m1, m2));
        std2.setModules(Arrays.asList(m1, m2));
        assertEquals(Arrays.asList(m1, m2) , std1.getModules());
        assertEquals(Arrays.asList(m1, m2) , std2.getModules());
    }

    @Test
    public void addingCoursesToStudents() {
        std1.setCourse(cp1);
        std2.setCourse(cp1);
        assertEquals(cp1, std1.course);
    }

    @Test
    public void addModulestoLecturer() {
        l1.setlModules(Arrays.asList(m1, m2));
        assertEquals(Arrays.asList(m1, m2), l1.getlModules());
    }

    @Test
    public void addingModulesToCourse() {
        cp1.setModules(Arrays.asList(m1, m2));
        assertEquals(Arrays.asList(m1, m2), cp1.getModules());
    }
    @Test
    public void addStudentsToCP() {
        cp1.setStudents(Arrays.asList(std1, std2));
        assertEquals(Arrays.asList(std1, std2), cp1.getStudents());
    }

    @Test
    public void addLANDStoM() {
        m1.setStudents(Arrays.asList(std1, std2));
        m1.setLecturer(l1);
        m2.setStudents(Arrays.asList(std1, std2));
        m2.setLecturer(l1);
        assertEquals(l1, m2.getLecturer());
        assertEquals(Arrays.asList(std1, std2), m1.getStudents());
    }
    @Test
    public void testingConstructorsAndGetters()
    {
        /*Testing Student*/
        assertEquals("Bob Marley", std1.getName());
        assertEquals("BobMarley18", std1.getUsername());
        assertEquals(18, std1.getAge());
        assertEquals(19723725, std1.getID());
        assertEquals(DateTime.parse("2000-12-13T21:39:45.618-08:00"), std1.getDOB());

        /*Testing Lecturer */
        assertEquals("Eminem", l1.getlName());
        assertEquals("Eminem50", l1.getlUsername());
        assertEquals(50, l1.getlAge());
        assertEquals( 123 , l1.getlID());
        assertEquals(DateTime.parse("1980-12-13T21:39:45.618-08:00"), l1.getlDOB());

        /*Testing Module*/
        assertEquals("ECE301", m1.getmName());

        /*Testing Course Programme*/
        assertEquals("ECE", cp1.getCpName());
        assertEquals(DateTime.parse("1022-09-01T09:00:00.618-08:00"), cp1.getAST());
        assertEquals(DateTime.parse("1022-12-21T09:00:00.618-08:00"), cp1.getAFT());
    }

    @Test
    public void testingSettersGetters()
    {
        std1.setAge(19);
        std1.setDOB(DateTime.parse("2000-12-14T21:39:45.618-08:00"));
        std1.setID(197);
        std1.setName("Bob");
        assertEquals("Bob", std1.getName());
        assertEquals("Bob19", std1.getUsername());
        assertEquals(19, std1.getAge());
        assertEquals(197, std1.getID());

        l1.setlAge(10);
        l1.setlDOB(DateTime.parse("2000-12-14T21:39:45.618-08:00"));
        l1.setlID(196);
        l1.setlName("John");
        assertEquals("John", l1.getlName());
        assertEquals("John10", l1.getlUsername());
        assertEquals(10, l1.getlAge());
        assertEquals( 196 , l1.getlID());
        assertEquals(DateTime.parse("2000-12-14T21:39:45.618-08:00"), l1.getlDOB());

        cp1.setCpName("ARTS");
        assertEquals("ARTS", cp1.getCpName());
    }
}