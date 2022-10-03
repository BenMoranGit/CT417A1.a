package org.example;
import org.joda.time.DateTime;
import java.util.List;

public class Module {

    public String mName;
    public List<String> students;
    public List<String> aCourses;
    public String rLecturer;

    public Module(String name, List<String> students, List<String> aCourses, String rLecturer){
        this.mName = name;
        this.students = students;
        this.aCourses = aCourses;
        this.rLecturer = rLecturer;
    }

    public void setName(String name) {
        this.mName = name;
    }
    public String getName(){
        return this.mName;
    }

    public void setStudents(List<String> students){
        this.students = students;
    }
    public List<String> getStudents(){
        return this.students;
    }

    public void setCourses(List<String> courses){
        this.aCourses = courses;
    }
    public List<String> getCourses(){
        return this.aCourses;
    }

    public void setLecturer(String lecturer){
        this.rLecturer = lecturer;
    }
    public String getLecturer(){
        return this.rLecturer;
    }
}
