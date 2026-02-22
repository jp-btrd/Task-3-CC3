public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private String program;
    private String gender;
    private String majorSubject;

    public Student (int id, String firstName, String lastName, String middleName, int age, String program, String gender, String majorSubject) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.program = program;
        this.gender = gender;
        this.majorSubject = majorSubject;   
    }

    public int getId() {return id}
    public String getFirstName() {return firstName}
    public String getLastName() {return lastName}
    public String getMiddleName() {return middleName}
    public int getAge() {return age}
    public String getProgram() {return program}
    public String getGender() {return gender}
    public String getMajorSubject() {return majorSubject}
}

// atilano's part