import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class JUnitA1 {
    String s1Name = "Bob Marley";
    int s1Age = 18;
    DateTime s1DOB = DateTime.parse("2004-12-13T21:39:45.618-08:00"); /*"MM/dd/yyyy HH:mm:ss", and MM/dd/yyyy */
    int s1ID = 19723725;
    List<String> s1Courses = new ArrayList<>();
    List<String> s1CoursesTest = new ArrayList<>();
    List<String> s1Modules;
    Student std1 = new Student(s1Name, s1Age, s1DOB, s1ID, s1Courses, s1Modules);

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
    s1Courses.add("EE345");
    s1Courses.add("ECE404");
    s1Courses.add("CT417");
    s1CoursesTest.add("EE345");
    s1CoursesTest.add("ECE404");
    s1CoursesTest.add("CT417");
        assertEquals(s1CoursesTest, std1.getCourses());
    }

}