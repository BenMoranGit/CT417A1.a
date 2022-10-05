import org.example.CourseProgramme;
import org.example.Lecturer;
import org.example.Module;
import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class JUnitA1 {
    String s1Name = "Bob Marley";
    int s1Age = 18;
    DateTime s1DOB = DateTime.parse("2004-12-13T21:39:45.618-08:00"); /*"MM/dd/yyyy HH:mm:ss", and MM/dd/yyyy */
    int s1ID = 19723725;
    List<CourseProgramme> s1Courses;
    List<Module> s1Modules;
    Student std1 = new Student(s1Name, s1Age, s1DOB, s1ID);

    CourseProgramme cp1 = new CourseProgramme("ECE", DateTime.parse("2004-01-13T21:39:45.618-08:00"), DateTime.parse("2004-12-13T21:39:45.618-08:00"));
    Module m1 = new Module("ECE404");
    Lecturer l1 = new Lecturer("Tupac", 51, DateTime.parse("1990-01-13T21:39:45.618-08:00"), 50);
    @Test
    public void testSettingStudentVariable()
    {
        assertEquals("Bob Marley", std1.getName());
        assertEquals("Bob Marley18", std1.getUsername());
        assertEquals(18, std1.getAge());
        assertEquals(19723725, std1.getID());
    }
    @Test
    public void testJodaTime()
    {
        assertEquals(DateTime.parse("2004-12-13T21:39:45.618-08:00"), std1.getDOB());
    }
    @Test
    public void testLists()
    {
    std1.setCourses(Arrays.asList(cp1));
    assertEquals(Arrays.asList(cp1), std1.getCourses());
    }

}