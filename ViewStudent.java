package student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewStudent {
    public static void main(String[] args) {
        try {
            Connection con = DB.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age")
                );
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
