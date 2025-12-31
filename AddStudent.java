package student;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddStudent {
    public static void main(String[] args) {
        try {
            Connection con = DB.connect();
            String sql = "INSERT INTO student (name, age) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Lily");
            ps.setInt(2, 16);
            ps.executeUpdate();

            System.out.println("Student Added");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

