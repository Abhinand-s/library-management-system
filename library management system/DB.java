import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
public class DB {
    
    public static Connection getConnection(){
        
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");

		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","949693");
			if (con != null) {
			System.out.println("Connected");
}
			
            return con;
        }
        
        catch(Exception e){
			//System.out.println("error");
            
            JOptionPane.showMessageDialog(null,e );            
        }
        return null;
        
    }
    
}

