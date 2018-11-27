
import org.apache.commons.net.util.SubnetUtils;
import org.apache.commons.net.util.SubnetUtils.SubnetInfo;


public class Netmask 
{	    
	public static void main(String args[])
	{
		String a="";
		String b="255.0.0.0";
		//String c="192.0.2.123";
 
		try
		{

			SubnetInfo checkgateway = (new SubnetUtils(a,b)).getInfo();
			boolean test = checkgateway.isInRange(a);
					
			System.out.println(checkgateway);
			System.out.println("**********************+++++++++++++++++++++++++++"+test);
		
		
			if(test==false)
			{
				System.out.println("asdfasfsadfsdafasdfasdf");
			}
			  /* String net = "192.168.0.3/24";
			   SubnetUtils utils = new SubnetUtils(net);
			   SubnetInfo info = utils.getInfo();
			   System.out.println(info);
			    */
		   
		}
		catch(IllegalArgumentException e)
		{}
	}

}
