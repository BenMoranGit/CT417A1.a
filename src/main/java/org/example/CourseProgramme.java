package org.example;
import org.joda.time.DateTime;
import java.util.List;

public class CourseProgramme {

    public String cpName;
    public List<Module> pModules;
    public List<Student> students;
    public DateTime aST;
    public DateTime aFT;

    public CourseProgramme(String cpName, DateTime aST, DateTime aFT){
        this.cpName = cpName;
        this.aST = aST;
        this.aFT = aFT;
    }

    public void setCpName(String name){this.cpName = name;}
    public String getCpName(){return this.cpName;}
    public void setModules(List<Module> Modules){this.pModules = Modules;}
    public List<Module> getModules(){
        return this.pModules;
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }
    public List<Student> getStudents(){
        return this.students;
    }
    public void setAST(DateTime aST){
        this.aST = aST;
    }
    public void getAFT(DateTime aFT){
        this.aFT = aFT;
    }
    public void setAFT(DateTime aFT){
        this.aFT = aFT;
    }
    public void getaFT(DateTime aFT){
        this.aFT = aFT;
    }

}
