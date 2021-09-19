/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sourav
 */
public class Marks {
    private String id;
    private int pc;
    private  int maths;
    private int english;
    private int cfo;
    private int os;
    private int total;
    private double percentage;
    private double cgpa;
    
    
    public Marks( String Id, int Pc,int Maths,int English,int Cfo,int Os,int Total,double Percentage,double Cgpa)
    {
 
        this.id = Id;
        this.pc = Pc;
        this.maths = Maths;
        this.english= English;
        this.cfo=Cfo;
        this.os=Os;
        this.total=Total;
        this.percentage=Percentage;
        this.cgpa=Cgpa;
        
    }
    
    public String getId()
    {
        return id;
    }
    
    public int getPc()
    {
        return pc;
    }
    public int getCfo()
    {
        return cfo;
    }
    
  public int getOs()
    {
        return os;
    }
    public int getTotal()
    {
        return total;
    }
    public double getPercentage()
    {
        return percentage;
    }
    public double getCgpa()
    {
        return cgpa;
    }
    public int getEnglish()
    {
        return english;
    }
public int getMaths()
    {
        return maths;
    }    

}

