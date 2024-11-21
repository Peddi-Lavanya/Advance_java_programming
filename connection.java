import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Lava{
public static void main(string args[])throws SQLException,ClassNotFound{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Database_Name","root","tiger");
String q1="create table emp(empid number primary key,empname varchar2(20),empsal number");
Statement st=connection.createStatement();
int x=st.executeUpdate(q1);
System.ouyt.println("Table create successfully"+x);
Statement.close();
Connection.close();
System.out.println("Connection is closed successfully");
}
}
//using try catch block
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Lava{
	public static void main(String args[]){
		Connection conn=null;
		Statement st=null;
		try{
			class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Database_name","root","tiger");
			System.out.println(conn);
			System.out.println("Connection created successfully");
			String q1="insert into emp values(111,"abby",10000)";
			String q2="insert into emp values(222,"Lava",20000)";
			String q3="insert into emp values(333,"bhanu",30000)";
			st=connection.createStatement();
			st.executeUpdate(q1);
			st.executeUpdate(q2);
			st.executeUpdate(q3);
			System.out.println("Values are inserted successfully...");
		}catch(ClasssNotFound|SQLException e){
			System.out.println(e);
		}
		finally{
			if(statement!=null)st.close();
			if(connection!=null)conn.close();
		}catch(SQLExcaption e){
		System.out.println(e);}
	}System.out.pritnln("Connection closed successfully...");
}
}
			