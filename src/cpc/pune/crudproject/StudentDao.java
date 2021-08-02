package cpc.pune.crudproject;

import java.sql.*;
import java.util.ArrayList;

public class StudentDao {

	public void getStudList(StudentForm studentForm) {

		ArrayList<Student> studList=new ArrayList<Student>();
		
	     Connection con=null;

	     try
	       {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sweety"); 

	         String query="Select * from student order by sno"; 

	         Statement stmt=con.createStatement();          
	         ResultSet rs=stmt.executeQuery(query);

	         Student s=null;
	         
	         while(rs.next())
	           {
	        	 s=new Student();
	        	 s.setSno(rs.getString("sno"));
	        	 s.setSname(rs.getString("sname"));
	        	 s.setAge(rs.getString("age"));	   
	        	 
	        	 studList.add(s);
	           }
	         

	         rs.close();
	         stmt.close();
	         con.close(); 
	       }
	     catch(Exception e)
	       {
	         System.out.println(e);
	       }		
		
	     studentForm.setStudList(studList);
	}

}
