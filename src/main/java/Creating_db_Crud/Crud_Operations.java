package Creating_db_Crud;

import java.sql.*;
import java.util.Scanner;

public class Crud_Operations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		1.Creating The Database
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("create database Jdbc_Emp");
//		boolean exe = p.execute();
//		System.out.println(exe);
//		c.close();
		
//		2.Creating Table with Fileds
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("create table Employee_jdbc(Id Integer primary key, Name varchar(20), Sal Integer)");
//		boolean exe = p.execute();
//		System.out.println(exe);
//		c.close();
		
//		3.Inserting the values
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("insert into Employee_jdbc values(103,'Gigi',20000.50)");
//		int exe = p.executeUpdate();
//		System.out.println(exe);
//		c.close();
		
//		4.Update the Values
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("update Employee_jdbc set sal = 88000 where id = 101");
//		int exe = p.executeUpdate();
//		System.out.println(exe);
//		c.close();
		
//		5. Deleting records
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("delete from Employee_jdbc where id = 101");
//		int exe = p.executeUpdate();
//		System.out.println(exe);
//		c.close();
		
//		6.Fetching The records
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("select * from Employee_jdbc");
//		ResultSet exe = p.executeQuery();
//		while(exe.next()) 
//		{
//			System.out.println(exe.getInt(1) +" "+exe.getString(2)+" "+exe.getDouble(3));
//		}
//		c.close();
		
//		7.Fetching using Query with condition
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("select * from Employee_jdbc where name like 'M%'");
//		ResultSet exe = p.executeQuery();
//		while(exe.next()) 
//		{
//			System.out.println(exe.getInt(1) +" "+exe.getString(2)+" "+exe.getDouble(3));
//		}
//		c.close();
		
		
//		8.Inserting the values with dynamic input
		
//		Scanner sc = new Scanner(System.in);
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("insert into Employee_jdbc values(?,?,?)");
//		
//		System.out.println("Eneter id");
//		p.setInt(1, sc.nextInt());
//		System.out.println("Eneter name");
//		p.setString(2, sc.next());
//		System.out.println("Eneter sal");
//		p.setDouble(3, sc.nextDouble());
//
//		int exe = p.executeUpdate();
//		System.out.println(exe);
//		c.close();
		
//		9. Deleting records using dynamic input
		
//		Scanner sc = new Scanner(System.in);
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("delete from Employee_jdbc where id = ?");
//		System.out.println("Enter id to delete");
//		p.setInt(1, sc.nextInt());
//		int exe = p.executeUpdate();
//		System.out.println(exe);
//		c.close();
		
//		10. Update Using Dynamic Input
		
//		Scanner sc = new Scanner(System.in);
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
//		CallableStatement p = c.prepareCall("update Employee_jdbc set sal = ? where id = ?");
//		
//		System.out.println("Enter id to update");
//		p.setInt(2, sc.nextInt());
//		System.out.println("Enter sal to Update");
//		p.setDouble(1, sc.nextDouble());
//		
//		int exe = p.executeUpdate();
//		System.out.println(exe);
//		c.close();
		
//		7.Fetching using Query with condition using Dynamic input
		
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_emp","root","Manoj@8310");
		CallableStatement p = c.prepareCall("select * from Employee_jdbc where id = ?");
		System.out.println("Enter id to Fetch");
		p.setInt(1, sc.nextInt());
		ResultSet exe = p.executeQuery();
		while(exe.next()) 
		{
			System.out.println(exe.getInt(1) +" "+exe.getString(2)+" "+exe.getDouble(3));
		}
		c.close();
		
		
	}
}
