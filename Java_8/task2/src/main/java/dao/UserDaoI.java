package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import util.ConnectionHelper;

public class UserDaoI implements UserDao{
	
	static Connection con;
	
	 PreparedStatement stat;
	
	
	 static
	 {
		
		 try
		 {
			
			 con=ConnectionHelper.getConnection();
			
			
		 }
		 catch(Exception  e)
		 {
			 System.out.println(e.getMessage());
			
		 }
	 }
	

	@Override
	public void signup(User u) {
				
				try
				{
						
		String sql="insert into login values(?,?,?,?)";	
		 
		stat=con.prepareStatement(sql);
		 
		  stat.setInt(1, u.getUserId() );
		  stat.setString(2, u.getName());
		  
		  stat.setString(3, u.getEmailid());
		 
		  
		  stat.setString(4, u.getPassword());
		  
		  stat.executeUpdate();
		  
		 
				}
				 catch(Exception  e)
				 {
					 System.out.println(e.getMessage());
					
				 }			
			}	
			

	@Override
	public void forgotpass(int uid, String email) {
		  
		try
		{
			String sql="select password from login where userid=? and email=?";
			stat=con.prepareStatement(sql);
			stat.setInt(1, uid);
			stat.setString(2, email);
			ResultSet  rs= stat.executeQuery();
			if(rs.next())
				{
					 System.out.print(rs.getString("password"));
				  
			  }
			  else
			  {
					 System.out.print("Not Found");
	 
			  }
			
		}
		catch(Exception  e)
		 {
			 System.out.println(e.getMessage());
			
		 }		
		
		
	}

	@Override
	public void signin(int uid, String pass) {
		// TODO Auto-generated method stub
		

		//Q3. Sign In
		//Implement a login feature where a user can enter:
		//userId
		//password
		
		try
		{
			String sql="select name from login where userid=? and password=?";
			stat=con.prepareStatement(sql);
			stat.setInt(1, uid);
			stat.setString(2, pass);
			ResultSet  rs= stat.executeQuery();
			if(rs.next())
				{
					 System.out.print("Logged in");
				  
			  }
			  else
			  {
					 System.out.print("Invalid credentials");
	 
			  }
			
		}
		catch(Exception  e)
		 {
			 System.out.println(e.getMessage());
			
		 }		
		
		
	}

	@Override
	public void showAll() {
		
		try
		{
		String sql="select userid,name from login";
		stat=con.prepareStatement(sql);
		  ResultSet  rs= stat.executeQuery();
		  while(rs.next())
		  {
				 System.out.println("Userid: "+ rs.getInt("userid") + "  ");
				 System.out.println("Username: "+ rs.getString("name"));		  
		  }
		
		
		}
		catch(Exception e)
		{
			 System.out.println(e.getMessage());
 
			
		}		
		
	}

}
