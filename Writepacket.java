import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Date;


public class Writepacket {

	
	
	public void writePacket(String arg)
	{
		//System.out.println(arg);
		
		 try{
				Class.forName("com.mysql.jdbc.Driver");  
				  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dateui","root","date1234");  
				  
				Statement stmt=con.createStatement();  
				  
				ResultSet resultSet = stmt.executeQuery("select value from ServerConfiguration where type='DATETraficLog'");
					
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				
				
				
				while( resultSet.next() ) 
				{
					
					String a=resultSet.getString(1);
					System.out.println(a);
					
					File file = new File(a +"/LOG.txt");
					
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(dateFormat.format(date) +"   "+ arg);
					bw.newLine();bw.newLine();bw.newLine();
					bw.close();
					
					System.out.println("Done");

				}
				
	        }
		 catch (Exception e)
		 {        
		
		 }		
	}
	
public static void main(String[] args)
	
	{
		String arg="velmurugan";
		Writepacket obj=new Writepacket();
		obj.writePacket(arg);
		
	
	}
	
	
	
}
