import java.io.EOFException;
import java.util.concurrent.TimeoutException;
import org.pcap4j.core.BpfProgram;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapHandle;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.Pcaps;
import org.pcap4j.packet.Packet;


public class ReadPacketFile
{

	public static void main(String args[]) throws PcapNativeException, NotOpenException 
	{
	
	
		  PcapHandle ph = Pcaps.openOffline("/home/sets/Desktop/master.pcap");
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
   }