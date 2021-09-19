/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sourav
 */
public class User {
    private String name;
    private String branch;
    private  String course;
    private int year;
    private String id;
    
    
    public User( String Name, String Branch, String Course,int Year,String Id)
    {
 
        this.name = Name;
        this.branch = Branch;
        this.course = Course;
        this.year= Year;
        this.id=Id;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getBranch()
    {
        return branch;
    }
    public String getCourse()
    {
        return course;
    }
    
    public int getYear()
    {
        return year;
    }
    
}
