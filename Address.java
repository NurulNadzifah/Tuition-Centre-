public class Address{
        
    private String schoolName;
    private String district;
    private String postcode;
    private String state;
    
    // constructor
    public Address(String schoolName, String district, String postcode, String state){
        this.schoolName = schoolName;
        this.district = district;
        this. postcode = postcode;
        this.state = state;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String ToString(){
        return schoolName + ", " + district + ", " + postcode + ", " + state;
    }
    
        /*public static void address(String[] arg){
        String string = "Sekolah Menengah Kebangsaan Jalan Empat, 36250, Bandar Baru Bangi, Selangor";
		
		String[] parts = string.split(", ");
		
		string = "School Name: " + parts[0] + "\n" +
		         "Posscodes: " + parts[1] + "\n" +
		         "Region: " + parts[2] + "\n" +
		         "State: " + parts[3] + "\n";
		         
		System.out.println(string);
		         
		String address = "No. 11 Taman Reko Mutiara,  Jalan Perawan 7, 42560, Taman Bukit Rambai, Melaka";
		
		String[] fullAddress = address.split(", ");
		
		address = "House Number: " + fullAddress[0] + "\n" +
		         "Street Number: " + fullAddress[1] + "\n" +
		         "Posscodes: " + fullAddress[2] + "\n" +
		         "Region: " + fullAddress[3] + "\n" +
		         "State: " + fullAddress[4] + "\n";
		         
		System.out.println(address);*/
}
		
