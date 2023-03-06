// for one students

public class Student {
  // data/attributes 
  // data will lead to A student;
  Name name;
  Address address;
  
  private String ic;
  private String schoolName;

  // java array always dynamic
  // declare above the function so no need to pass as parameter as it is accessible
  float marks[] = new float[5];
  //mike.getName();

  private float total = 0;
  // methods or operations or functions

  /*for(int i = 0; i < 5; i++){
     marks[i] = System.out.println("Mark #" + i":");
     } */
  public Student(Name name, Address address, String schoolName){
      this.name = name;
      this.address = address;
      this.schoolName = schoolName;
  }

  public float calcAverage (){
      
      float total = 0;
      
    for (int i = 0; i < 5; i++){
	    total += marks[i];
    }
    return total;
  }

  private float min = 0;

  public float calcMin (){
      
     float min = 99999;
      
     for (int i = 0; i < 5; i++){
        if(marks[i] < min){
            min = marks[i];
        }
      }

    return min;
  }
  
  public void setFullName (Name thename){
    this.name = thename;
  }

  public void setMark (float mark, int i){
    marks[i] = mark;
  }
  
  public Student(){
		    System.out.println("Object succesfully constructed");
		}

}
