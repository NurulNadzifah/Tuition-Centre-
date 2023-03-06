public class Name{
    
    // have a separate class cuz now the name is more complicated
    private String fname, lname, mname;
    
    public Name(){
        
    }
    
    // constructor - no return name as as class
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    
    // if does not put any access modifier, by default it was protected (can be access anywhere)
    
    
    public String getFName(){
        return fname;
    }
    
    public void setFName(String fname){
        
        // this means the current object
        this.fname = fname; 
    }
    
    public String getMName(){
        return mname;
    }
    
    public void setMName(String mname){
        this.mname = mname;
    }

    public String getLName(){
        return lname;
    }
    
    public void setLName(String lname){
        this.lname = lname;
    }
    
    public String ToString(){
        return fname + " " + mname + " " + lname;
    }
    
}