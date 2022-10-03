package org.example;
import org.joda.time.DateTime;
import java.util.List;

public class Lecturer {

    public String lName;
    public int lAge;
    public DateTime lDOB;
    public int lID;
    public List<String> lModules;
    public String lUsername;

    public Lecturer(String name, int age, DateTime DOB, int ID, List<String> modules){
        this.lName = name;
        this.lAge = age;
        this.lDOB = DOB;
        this.lID = ID;
        this.lModules = modules;
    }

    public String getUsername(){
        this.lUsername = this.lName + this.lAge; /*int to string*/
        return this.lUsername;
    }

    public void setName(String name) {
        this.lName = name;
    }
    public String getName(){
        return this.lName;
    }

    public void setAge(int age){
        this.lAge = age;
    }
    public int getAge(){
        return this.lAge;
    }

    public void setDOB(DateTime DOB){
        this.lDOB = DOB;
    }
    public DateTime getDOB(){
        return this.lDOB;
    }

    public void setID(int ID){
        this.lID = ID;
    }
    public int getID(){
        return this.lID;
    }

    public void setModules(List<String> modules){
        this.lModules = modules;
    }
    public List getModules(){
        return this.lModules;
    }

}
