import java.sql.*;
import java.util.*;
public class delps
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
        try
        {
        	 Class.forName("org.postgresql.Driver");
    		 Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
    		 PreparedStatement pst=con.prepareStatement("delete from emp where eno=?");
    		 System.out.println("enter emp no to delete record");
    		 int num=sc.nextInt();
    		 pst.setInt(1,num);
    		 pst.executeUpdate();
    		 System.out.println("record deleted.......");
    		 
    		 
    		 
    		 
        }catch(Exception e)
        {
        	System.out.println(e);
        	
        }
	}

}
