
public class Stringtohex 
{	
	
	public String stringtoHex(String str)
	{
		
		  char[] chars = str.toCharArray();

		  StringBuffer hex = new StringBuffer();
		  
		  for(int i = 0; i < chars.length; i++)
		  {
			  hex.append(Integer.toHexString((int)chars[i]));
		  }

		  return hex.toString();
	}
	
	public static void main(String args[])
	{
		 Stringtohex obj=new Stringtohex();
		
		 String hex = "www.setsindia.net";
		 
		 String aa=obj.stringtoHex(hex);
		 
		 System.out.println(aa);
		
	}
}

