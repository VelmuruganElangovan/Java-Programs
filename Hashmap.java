
import java.sql.*;
import java.sql.Connection;
import java.util.*;
public class Hashmap {

	
	public void initAppcode() 
	{
		 try{
				Class.forName("com.mysql.jdbc.Driver");  
				  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dateui","root","date1234");  
				  
				//here dpi is database name, root is username and password  
				  
				Statement stmt=con.createStatement();  
				  
				ResultSet resultSet = stmt.executeQuery("select appcode, status from DATEAppcode");
			 
				HashMap<String,Integer> hm=new HashMap<String,Integer>();  
				  
				while( resultSet.next() ) 
				{
					//System.out.println(resultSet.getString(1)+" \n "+resultSet.getInt(2));  
					
					hm.put(resultSet.getString(1),resultSet.getInt(2));//Integer.valueOf(resultSet.getString(1)), String.valueOf(resultSet.getInt(2)));
					
					
				}
				for(Map.Entry m:hm.entrySet())
				{  
					   System.out.println(m.getKey()+" "+m.getValue());  
				}  
				
				resultSet.close();
			
				
	        }
		 catch (Exception e)
		 {        
		
		 }
		 
		 
}
	public static void main(String[] args)
	
	{
		Hashmap obj=new Hashmap();
		obj.initAppcode();
		
		
		
		
	
	}
	
}

