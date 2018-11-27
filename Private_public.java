

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;


public class Private_public {

    	private static boolean isPrivateIPAddress(String ipAddress) 
    	{
            InetAddress ia = null;

            try 
            {
                InetAddress ad = InetAddress.getByName(ipAddress);
                
                byte[] ip = ad.getAddress();
                
                ia = InetAddress.getByAddress(ip);
                                                
            } 
            catch (UnknownHostException e) 
            {
                e.printStackTrace();
            }

            return ia.isSiteLocalAddress();
        }
    	
    	public static void main(String args[])
    	{
    		boolean check=isPrivateIPAddress("10.168.0.0"); 
    		System.out.println(check);
    	}
    	
    }

