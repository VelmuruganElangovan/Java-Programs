import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Filesearch 
{
	
try {
		 

	File folder = new File("/var/belcrl/PCAPS/");
	
	File[] listOfFiles = folder.listFiles();
	
	
	
	
	for (File file : listOfFiles) 
	{

	    ServerConfigurationObj listpcap = new ServerConfigurationObj();

	    if (file.isFile()) {
	    		   
	    	listpcap.setPcapfilename(file.getName());
	    	
	    	//System.out.println("list pcap  " +file.getName());
	    	
	    	ServerConfigurationObjs.add(listpcap);
	    	
	    }
	    
	}
 }
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
