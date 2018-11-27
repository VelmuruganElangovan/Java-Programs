import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Writefile 
{
	
	
	public static void main(String[] args) throws IOException 
	{
		
		 StringBuffer writefileupdate = new StringBuffer();  

		 writefileupdate.append("vel" + "\n");
		 writefileupdate.append("murugan");
		
		 
		 Runtime linuxwritefile= Runtime.getRuntime();
	    	 String[] writefile= {"/bin/bash","-c","echo" + " " +"'"+writefileupdate+ "'"  +"> /home/sets/var/smoothwall/ethernet/settings"};  
	     
	     	 System.out.println(writefileupdate);
	     
	     	 Process pro_write = linuxwritefile.exec(writefile);
	    	

	}

	
	
	
	/*
	public static void main(String args[]) throws IOException{
		 
		
    	 StringBuilder writefileupdate = new StringBuilder("");  

    	
		 Runtime linuxcommand = Runtime.getRuntime();                    	

	     String[] delcommand= {"/bin/bash","-c","cat /dev/null > /home/sets/var/smoothwall/ethernet/settings"};                
		 Process delpro = linuxcommand.exec(delcommand);  
			
		 
		 writefileupdate.append("vel" + "\n");
		 writefileupdate.append("murugan");

	     
		 System.out.println(writefileupdate);

	        
		 FileWriter fstream = new FileWriter("/home/sets/var/smoothwall/ethernet/settings",true);
		 BufferedWriter out = new BufferedWriter(fstream);
				   	 
		 out.write(writefileupdate.toString());
				   		
		 out.close();
		 fstream.close();
		
			
	}
	
	*/
}
