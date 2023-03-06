// the name must be exactly the same as the file
public class Teacher{
    
    // data
    Name Tname;
    private String ic;
    Address Taddress;
    private int numYear;
    private String qualification;
    
    // operation
    public Teacher(Name Tname, String ic, Address Taddress, int numYear, String qualification){
        this.Tname = Tname;
        this.ic = ic;
        this.Taddress = Taddress;
        this.numYear = numYear;
        this.qualification = qualification;
    }
    
    public void setIc(String ic){
        this.ic = ic;
    }
    
    public void setAddress(Address address){
        this.Taddress = address;
    }
    
    public String getIc(){
        return ic;
    }
    
    public void setNumYear(int numYear){
        this.numYear = numYear;
    }
    
    public int getNumYear(){
        return numYear;
    }
    
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    
    public String getQualification(){
        return qualification;
    }
    
    public String toString(){
        return Taddress.ToString() + " \n" + Tname.ToString();
    }
}