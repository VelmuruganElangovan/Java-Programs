
public class Convert_into_bytes {
	
	
	public static void main(String args[])
	{
		
		try
		{
			String a="10.0 MB";
			
			String size=a.split(" ")[0];
			String sizeformat=a.split(" ")[1];
			
			
			if(sizeformat.equalsIgnoreCase("BYTES"))
			{
				
				System.out.println(size);
				
			}		
			if(sizeformat.equalsIgnoreCase("KB"))
			{
				
				double kb=Double.valueOf(size);
				
				double bytee=kb*1024;
			
				String result=Double.toString(bytee).replace(".", "");//.substring(0,6);
				
				System.out.println(result);
				
			}
			else if(sizeformat.equalsIgnoreCase("MB"))
			{
				
				double mb=Double.valueOf(size);
				
				double bytee=mb*1048576;
				
				System.out.println(bytee);
				
				String result=Double.toString(bytee).replace(".", "");//.substring(0,6);

				System.out.println(result);
				
					
			}
			else if(sizeformat.equalsIgnoreCase("GB"))
			{
				
				double gb=Double.valueOf(size);
				
				double bytee=gb*1073741824;
				
				String result=Double.toString(bytee).replace(".", "");//.substring(0,6);

				System.out.println(result);
			
				
			}
			else if(sizeformat.equalsIgnoreCase("TB"))
			{
				
				double tb=Double.valueOf(size);
				
				double bytee=tb*1099511627776l;
			
				String result=Double.toString(bytee).replace(".", "");//.substring(0,6);
				
				System.out.println(result);
				
			}
		
		}
		catch(NumberFormatException e)
		{
			
		}
	}

}
