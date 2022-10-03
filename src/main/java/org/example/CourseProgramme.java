package org.example;
import org.joda.time.DateTime;
import java.util.List;

public class CourseProgramme {

    public List<String> pModules;
    public List<String> students;
    public DateTime aST;
    public DateTime aFT;

    public CourseProgramme(List<String> pModules, List<String> students, DateTime aST, DateTime aFT){
        this.pModules = pModules;
        this.students = students;
        this.aST = aST;
        this.aFT = aFT;
    }

    public void setModules(List<String> Modules){
        this.pModules = Modules;
    }
    public List<String> getModules(){
        return this.pModules;
    }

    public void setStudents(List<String> students){
        this.students = students;
    }
    public List<String> getStudents(){
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
