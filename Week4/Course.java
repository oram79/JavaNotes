package Week4;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textBook;

    public Course(String name; Instructor instr, Textbook text)
    {
        this.courseName = name;
        this.instructor = instr;
        this.textBook = text;
    }
    public String getName() {
        return courseName;
    }
    public Instructor geInstructor() {
        return this.instructor;
    }
    public Textbook getTextbook() {
        return this.textBook;
    }
}
