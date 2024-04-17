import java.io.*;
import java.sql.*;
public class jdbcseta1
{
public static void main(String g[])
{
Connection con;
ResultSet rs;
Statement st;
try

{
Class.forName("org.postgresql.Driver");

con=DriverManager.getConnection("jdbc:postgresql://localhost/tydb","postgres",
"");

st=con.createStatement();
rs=st.executeQuery("select * from product");
while(rs.next())
{
System.out.println("Product  Id:"+rs.getString(1));
System.out.println("Product Name:"+rs.getString(2));
System.out.println("Product  Description:"+rs.getInt(3));
}
}catch(Exception e)
{
System.out.println(e);
}

}
}

