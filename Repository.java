import java.sql.*;
import java.util.*;

public class Repository {
    private Connection conn;

    public Repository() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:students.db");
        } catch (SQLException e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
    }

    public void saveStudent(Student s) {
        String sql = "INSERT OR REPLACE INTO students VALUES(?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getFirstName());
            ps.setString(3, s.getLastName());
            ps.setString(4, s.getMiddleName());
            ps.setInt(5, s.getAge());
            ps.setString(6, s.getProgram());
            ps.setString(7, s.getGender());
            ps.setString(8, s.getMajorSubject());
            ps.setString(9, s.getPhysicalAddress());
            ps.setString(10, s.getEmailAddress());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String query = "SELECT * FROM students";

        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            while (rs.next()) {
                list.add(new Student(
                        rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void close() {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}