package testjbdc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JbdcTest {

	public static void main(String[] args) throws Exception{
		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection("jbdc:postgresql://localhost:5432/jpatraining", "postgres", "root");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select e from eployee.emp");
		while(rs.next())
		{
			System.out.println("Emp No:"+rs.getInt(1));
			System.out.println("Emp No:"+rs.getString(2));
		}
	}
}
