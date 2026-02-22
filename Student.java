public class Student {
    private int id, age;
    private String firstName, lastName, middleName, program, gender, majorSubject, physicalAddress, emailAddress;

    public Student(int id, String firstName, String lastName, String middleName, int age,
                   String program, String gender, String majorSubject, String physicalAddress, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.program = program;
        this.gender = gender;
        this.majorSubject = majorSubject;
        this.physicalAddress = physicalAddress;
        this.emailAddress = emailAddress;
    }

    // Getters
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMiddleName() { return middleName; }
    public int getAge() { return age; }
    public String getProgram() { return program; }
    public String getGender() { return gender; }
    public String getMajorSubject() { return majorSubject; }
    public String getPhysicalAddress() { return physicalAddress; }
    public String getEmailAddress() { return emailAddress; }
}