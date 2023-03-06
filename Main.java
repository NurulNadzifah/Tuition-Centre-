/*1. Pandai Sdn Bhd runs a number of tuition centers throughout KL and JB. Depending on business
conditions, they are looking continually to open new centers and from time to time, 
they may have to close existing ones.  
 
Each tuition center, situated in a physical address and headed by a HeadMaster,
employs a number of tutors to handle batches of students (they take in a new batch each year). 
Tutors are all freelancers; they come and go throughout the year, and each student is assigned
to one tutor. Each center maintains the data for each tutor (name, IC,  address, qualification,
# yearexp, date joined, # years in the center etc) and each student (name, IC, address, year, 
schoolname, list of scores, etc). 
Pandai Sdn Bhd from time to time needs report on the performance of each center - #students, 
#tutors, avg marks, min, max,  tutors background, etc.*/

public class Main {
    
    // application code
	public static void main(String[] args) {
	    
	    Student mike = new Student();
	    
	    Name name = new Name();
	    Address address = new Address("SMK Jalan Empat" , "Kajang", "235647", "Kuala Lumpur");
	    
	    Student adila = new Student();
	    
	    // for new student
	   
	    name = new Name("Syed", "Imran", "Shah");
	    Student syed = new Student();
	    syed.setFullName(name);
	    System.out.println(name.ToString());
	    
	    name.setFName("Adila");
	    name.setMName("binti");
	    name.setLName("Izzat");
	    adila.setFullName(name);
		
		int count = 0;
		
	    ListStudent sb2023 = new ListStudent();
	    sb2023.add(mike, 0);
	    sb2023.add(adila);
	    sb2023.add(syed);
	    
	    // declare a method that allows for the following - must be in ListStudent
	    // find the student
	    
	    boolean isIn = sb2023.find("Adila");
	    
	    if (isIn == false)
	        
	        System.out.println("The student is not in the list.");
	        
	    else
	    
	        System.out.println("The student is in the list.");
	    
		Teacher cikguMinah = new Teacher(new Name("Aminah", "Binti", "Hamid"), "0987654321", address, 2023, "10 years experience");
		
		float total = 0;
		float average = 0;
		
		//mike.name = "Michael";
		
		//fullName = fullName();
		
		for (int i = 0; i<mike.marks.length; i++){
		    mike.marks[i] = 100;
		}
		
		// calculate and print the average
		total = mike.calcAverage();
		average = total/mike.marks.length;
		
		System.out.println("Average = " + average);
		
		// calculate the min marks for mike
		
		System.out.println("Min mark: " + mike.calcMin());
		
		System.out.println(cikguMinah);
	}
}
