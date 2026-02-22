import java.util.List;

public class Main {
    private static Repository repo;

    public static void main(String[] args) {
        repo = new Repository();

        initializeData();
        displayMasterList();

        repo.close();
    }

    public static void initializeData() {
        System.out.println("Processing data instantiation...");

        Student[] data = {
                new Student(1, "Juan", "Luna", "D", 22, "BSIT", "M", "Net", "Manila", "j@l.com"),
                new Student(2, "Maria", "Clara", "S", 20, "BSIT", "F", "Dev", "Cebu", "m@c.com"),
                new Student(3, "Jose", "Rizal", "P", 25, "BSCS", "M", "AI", "Laguna", "j@r.com"),
                new Student(4, "Andres", "Bonifacio", "C", 24, "BSIT", "M", "Sec", "Tondo", "a@b.com"),
                new Student(5, "Melchora", "Aquino", "M", 28, "BSIS", "F", "Mgmt", "QC", "m@a.com"),
                new Student(6, "Emilio", "Aguinaldo", "F", 21, "BSIT", "M", "Net", "Cavite", "e@a.com"),
                new Student(7, "Gabriela", "Silang", "A", 23, "BSIT", "F", "Dev", "Ilocos", "g@s.com"),
                new Student(8, "Apolinario", "Mabini", "B", 26, "BSCS", "M", "Math", "Batangas", "a@m.com"),
                new Student(9, "Marcelo", "Del Pilar", "H", 24, "BSIT", "M", "Sec", "Bulacan", "m@d.com"),
                new Student(10, "Gregoria", "De Jesus", "K", 22, "BSIS", "F", "Dev", "Caloocan", "g@d.com")
        };

        for (Student s : data) {
            repo.saveStudent(s);
        }
        System.out.println("10 records have been stored in the database.");
    }

    public static void displayMasterList() {
        System.out.println("\n--- STUDENT MASTER LIST ---");
        System.out.printf("%-4s | %-20s | %-10s\n", "ID", "Full Name", "Program");
        System.out.println("--------------------------------------------------");

        for (Student s : repo.getAllStudents()) {
            String fullName = s.getFirstName() + " " + s.getLastName();
            System.out.printf("%-4d | %-20s | %-10s\n", s.getId(), fullName, s.getProgram());
        }
    }
}