import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IssueBookDao {

    public static boolean checkBook(String bookcallno) {
        boolean status = false;
        try (Connection con = DB.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM books WHERE callno=?")) {

            ps.setString(1, bookcallno);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static int save(String bookcallno, int studentid, String studentname, String studentcontact, int id) {
        int status = 0;
        try (Connection con = DB.getConnection()) {

            status = updateBook(bookcallno);// updating quantity and issue

            if (status > 0) {
                try (PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO issuebooks(id,bookcallno, studentid, studentname, studentcontact) VALUES (?, ?, ?, ?, ?)")) {

                    ps.setString(1, bookcallno);
                    ps.setInt(2, studentid);
                    ps.setString(3, studentname);
                    ps.setString(4, studentcontact);
                    ps.setInt(5, id);

                    status = ps.executeUpdate();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static int updateBook(String bookcallno) {
        int status = 0;
        int quantity = 0, issued = 0;
        try (Connection con = DB.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT quantity, issued FROM books WHERE callno=?")) {

            ps.setString(1, bookcallno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                quantity = rs.getInt("quantity");
                issued = rs.getInt("issued");
            }

            if (quantity > 0) {
                try (PreparedStatement ps2 = con.prepareStatement(
                        "UPDATE books SET quantity=?, issued=? WHERE callno=?")) {

                    ps2.setInt(1, quantity - 1);
                    ps2.setInt(2, issued + 1);
                    ps2.setString(3, bookcallno);

                    status = ps2.executeUpdate();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
