import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDao {
    public static int save(String bookId, String callno, String name, String author, String publisher, int quantity) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO books(id, callno, name, author, publisher, quantity) VALUES(?, ?, ?, ?, ?, ?)");
            ps.setString(1, bookId);
            ps.setString(2, callno);
            ps.setString(3, name);
            ps.setString(4, author);
            ps.setString(5, publisher);
            ps.setInt(6, quantity);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
