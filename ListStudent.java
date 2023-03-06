
public class ListStudent{
    
    //data Section
    // what is a ListStudent
    // a student list is an array of Student
    private String name;
    private String fname, mname,lname;
    private Student students[] = new Student[10];
    private String fullName;
    
    private int currsz = 0;
    
    //operation method
    public void add(Student s, int i){
 
        students[i] = s;
        
    }
    
    // method overloading
    public void add(Student s){
        // masukkan nama dlm array
        students[currsz] = s;
        currsz = currsz + 1;
    }
    
    // find a particular student
    public boolean find(String name){
        
        // loop thru the array students
        // for each student in students
        // check whether the name is the same as that u student - decision making
        
         for(int i = 0; i < currsz; i++){
            // students[i] is a Student so cant do it like students[i] = name
            if(students[i].name.getFName() == name){
                if(students[i].name.getMName() == name){
                    return true;
                }
                else if(students[i].name.getLName() == name){
                    return true;
                }
                return true;
            }
        }
        return false;
    }
    
}