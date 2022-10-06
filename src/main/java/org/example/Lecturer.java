package org.example;
import org.joda.time.DateTime;
import java.util.List;

public class Lecturer {

    public String lName;
    public int lAge;
    public DateTime lDOB;
    public int lID;
    public List<Module> lModules;
    public String lUsername;

    public Lecturer(String lName, int lAge, DateTime lDOB, int lID) {
        this.lName = lName;
        this.lAge = lAge;
        this.lDOB = lDOB;
        this.lID = lID;
    }
    public String getlName() {return lName;}
    public void setlName(String lName) {this.lName = lName;}
    public int getlAge() {return lAge;}
    public void setlAge(int lAge) {this.lAge = lAge;}
    public DateTime getlDOB() {return lDOB;}
    public void setlDOB(DateTime lDOB) {this.lDOB = lDOB;}
    public int getlID() {return lID;}
    public void setlID(int lID) {this.lID = lID;}
    public List<Module> getlModules() {return lModules;}
    public void setlModules(List<Module> lModules) {this.lModules = lModules;}
    public  String getlUsername() {
        String username = this.lName + this.lAge; /*int to string*/
        this.lUsername = username.replaceAll("\\s","");
        return this.lUsername;
    }
}
