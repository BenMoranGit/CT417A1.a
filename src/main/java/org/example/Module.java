package org.example;

import java.util.List;

public class Module {

    public String mName;
    public List<Student> students;
    public List<CourseProgramme> aCourses;
    public Lecturer rLecturer;

    public Module(String name){this.mName = name;}
    public void setmName(String name){this.mName = name;}
    public String getmName(){return this.mName;}
    public void setStudents(List<Student> students){this.students = students;}
    public List<Student> getStudents(){
        return this.students;
    }
    public void setCourses(List<CourseProgramme> courses){this.aCourses = courses;}
    public List<CourseProgramme> getCourses(){
        return this.aCourses;
    }
    public void setLecturer(Lecturer lecturer){
        this.rLecturer = lecturer;
    }
    public Lecturer getLecturer(){
        return this.rLecturer;
    }
}
