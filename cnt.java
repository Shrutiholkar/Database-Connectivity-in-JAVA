import java.sql.*;
public class countdemo 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		Statement st=con.createStatement();
		int cnt=0;
		ResultSet rs=st.executeQuery("select * from emp");
		while(rs.next())
		{
		   cnt++;
			
		}
           System.out.println("number of record="+cnt);
           rs.close();
           st.close();
           con.close();
           
	}

}
