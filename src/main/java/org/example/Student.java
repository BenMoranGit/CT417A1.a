package org.example;
import org.joda.time.DateTime;
import java.util.List;

public class Student {
    public String sName; /* Review if setting these to private is smart*/
    public int sAge;
    public DateTime sDOB;
    public int sID;
    public CourseProgramme course;
    public List<Module> sModules;
    public String sUsername;

    public Student(String name, int age, DateTime DOB, int ID){
        this.sName = name;
        this.sAge = age;
        this.sDOB = DOB;
        this.sID = ID;
    }
    public String getUsername(){
        String username = this.sName + this.sAge; /*int to string*/
        this.sUsername = username.replaceAll("\\s","");
        return this.sUsername;
    }
    public void setName(String name) {this.sName = name;}
    public String getName(){return this.sName;}
    public void setAge(int age){this.sAge = age;}
    public int getAge(){return this.sAge;}

    public void setDOB(DateTime DOB){this.sDOB = DOB;}
    public DateTime getDOB(){return this.sDOB;}
    public void setID(int ID){this.sID = ID;}
    public int getID(){return this.sID;}
    public void setCourse(CourseProgramme sCourse){this.course = sCourse;}
    public CourseProgramme getCourses(){return this.course;}
    public void setModules(List<Module> modules){this.sModules = modules;}
    public List<Module> getModules(){return this.sModules;}

}
