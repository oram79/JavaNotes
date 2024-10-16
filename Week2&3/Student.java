package Week2;

public class Student {
    private int id;
    private String Fname;
    private String Lname;
    private String Address;
    private String Email;
    private String DOB;
    private String mobile;

    // Constructor
    public Student(int id, String Fname, String Lname, String Email, String DOB, String mobile) {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Email = Email;
        this.DOB = DOB;
        this.mobile = mobile;
    }

    // Getter and Setter methods for each attribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("First Name: " + Fname);
        System.out.println("Last Name: " + Lname);
        System.out.println("Email: " + Email);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Mobile: " + mobile);
        System.out.println("Address: " + Address);
    }
}
