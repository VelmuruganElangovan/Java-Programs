
import java.util.Scanner;
import java.util.concurrent.TimeoutException;
import java.io.IOException;
import java.io.EOFException;

import org.pcap4j.core.BpfProgram.BpfCompileMode;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PacketListener;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;
import org.pcap4j.core.PcapNetworkInterface.PromiscuousMode;
import org.pcap4j.packet.Packet;
import org.pcap4j.util.NifSelector;

import java.sql.*;


public class Packet_capture_parsing
{
	
	
	public void capture(String args)throws PcapNativeException, IOException, NotOpenException, InterruptedException
	{
	
		    PcapNetworkInterface nif = Pcaps.getDevByName(args);//new NifSelector().selectNetworkInterface();  //.selectNetworkInterface();
		    
		    
		    System.out.println(nif.getName());
		    
		    //System.out.print("====\n" + nif + "\n");   
		 
		    final PcapHandle handle = nif.openLive(65536, PromiscuousMode.PROMISCUOUS, 10);
		    
		 
		    PacketListener listener = new PacketListener() 
		    {
		
		    	public void gotPacket(Packet packet) 
		    	{
		    		printPacket(packet, handle);
		    	}
		    };
		 
		    handle.loop(-1, listener);
		  }
	  
		  
		  private static void printPacket(Packet packet, PcapHandle ph) 
		  {

		      StringBuilder sb = new StringBuilder();
		      sb.append("\n\nA packet captured at ")
		      .append(ph.getTimestamp())
		      .append(":");
  		      System.out.println(sb);
		      System.out.println(packet);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");  
				  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dateui","root","date1234");  
				  
				//here dpi is database name, root is username and password  
				  
				Statement stmt=con.createStatement();  
				  
		
				String sql = "INSERT INTO packet values('"+String.valueOf(ph.getTimestamp())+"')" ;
				stmt.executeUpdate(sql);
			}
			catch(Exception e)
			{ 
			        System.out.println(e);
			}  
		    
		  }
	
	
	
	public void parsing(String args)throws PcapNativeException, NotOpenException 
	
	{

		  PcapHandle ph = Pcaps.openOffline(args);
		 // ph.setFilter("tcp", BpfProgram.BpfCompileMode.OPTIMIZE);
	 
		int a=0;
	  	while (true) 
	  	{
	  		a=a+1; 
	  		System.out.println(a);
	  		
	    	try 
	    	{
	    		Packet p = ph.getNextPacketEx();
	    		if (p != null) 
	    		{
	    			System.out.println(p);
	    			
	 
					String timestamp=String.valueOf(ph.getTimestamp());
					try
					{
					Class.forName("com.mysql.jdbc.Driver");  
					  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dateui","root","date1234");  
					  
					//here dpi is database name, root is username and password  
					  
					Statement stmt=con.createStatement();  
					  
				
					String sql = "INSERT INTO packet values('"+timestamp+"')" ;
					stmt.executeUpdate(sql);
					}
					 catch(Exception e)
					 { 
						 System.out.println(e);
					 }  
					
					
	    		}
	    	} 
	    	catch (EOFException e) 
	    	{
	    		System.out.println("End of file");
	    		break;
	    	} 
	    	catch (TimeoutException e) 
	    	{
	    		System.out.println("Timed out");
	    		break;
	    	}
	  	
	  	}		
		
	}
	
	public static void main(String args[])throws PcapNativeException, IOException, NotOpenException, InterruptedException
	{
		
		//Scanner sc=new Scanner(System.in);  
		//System.out.println("Enter your Capture Mode");  
		//int mode=sc.nextInt();
		
		int mode=Integer.parseInt(args[0]);
				
		Packet_capture_parsing object=new Packet_capture_parsing();
		
	//	object.parsing();
	
		if(mode==1)
		{
			
			object.capture(args[1]);
		}
		else
		{
	
			object.parsing(args[1]);
		}
		//sc.close();
		 
		
	
	}
	
}
