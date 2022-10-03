package org.example;
import org.joda.time.DateTime;
import java.util.List;

public class Student {
    public String sName; /* Review if setting these to private is smart*/
    public int sAge;
    public DateTime sDOB;
    public int sID;
    public List<String> sCourses;
    public List<String> sModules;
    public String sUsername;


    public Student(String name, int age, DateTime DOB, int ID, List<String> courses, List<String> modules ){
        this.sName = name;
        this.sAge = age;
        this.sDOB = DOB;
        this.sID = ID;
        this.sCourses = courses;
        this.sModules = modules;
    }

    public String getUsername(){
        this.sUsername = this.sName + this.sAge; /*int to string*/
        return this.sUsername;
    }

    public void setName(String name) {
        this.sName = name;
    }
    public String getName(){
        return this.sName;
    }

    public void setAge(int age){
        this.sAge = age;
    }
    public int getAge(){
        return this.sAge;
    }

    public void setDOB(DateTime DOB){
        this.sDOB = DOB;
    }
    public DateTime getDOB(){
        return this.sDOB;
    }

    public void setID(int ID){
        this.sID = ID;
    }
    public int getID(){
        return this.sID;
    }

    public void setCourses(List<String> courses){
        this.sCourses = courses;
    }
    public List getCourses(){
        return this.sCourses;
    }

    public void setModules(List<String> modules){
        this.sModules = modules;
    }
    public List getModules(){
        return this.sModules;
    }

}
