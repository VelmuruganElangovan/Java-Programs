
public class HextoString 
{	
	
	public String hextoString(String hex)
	{
		
		    StringBuilder output = new StringBuilder();
		    
		    for (int i = 0; i < hex.length(); i+=2) 
		    {
		    	
		        String str = hex.substring(i, i+2);
		       
		        output.append((char)Integer.parseInt(str, 16));
		        
		    }
		    
		    return output.toString();
	}
	
	public static void main(String args[])
	{
		 HextoString obj=new HextoString();
		
		 String hex = "7777772e73657473696e6469612e6e6574";
		 
		 String aa=obj.hextoString(hex);
		 
		 System.out.println(aa);
		
	}
}

