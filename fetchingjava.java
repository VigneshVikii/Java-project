package jspp;
import java.util.Scanner;
import java.sql.*;
public class fetchingjava {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The EmPloyee * ID *");
		String Id=input.next();
			try
			{
			 	
				Connection con=DriverManager.getConnection("jdbc:mysql:///BCSM","root","Vickey@2090");
				Statement stmt=con.createStatement();
				String query="select *from Emp1 where Id ='" +Id+"'";
				ResultSet rs=stmt.executeQuery(query);
				if(rs.next()) {
				System.out.println(" ID: " +rs.getInt(1)+" "+"Name: " +rs.getString(2)
				+" "+"DEGREE: " +rs.getString(3)+" "+ " DOJ: " +rs.getDate(4)+
				" " +"Domain: "+rs.getString(5)+" "+"Package: " +rs.getString(6)+
				" "+"BLOOD GRP: " +rs.getString(7)+" "+"Branch: " +rs.getString(8));
					}
				else {
					System.out.println("THE GIVEN * ID * IS NOT EXIST \n "
							+ "Please Enter The Correct * ID * "
							);
				}}
				catch(SQLException e)
				{
					System.out.println("SERVER IS BUSY " +e);
				}
			}}