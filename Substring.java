
import java.io.*;

public class Substring 
{
	String[] multiSearchString(String inputstr, int[] startpos, int[] endpos )
	{
		int startpos_length=startpos.length;
		
		String[] substring=new String[startpos_length];

		
		for(int i=0;i<startpos_length;i++)
		{
			substring[i]=inputstr.substring(startpos[i],endpos[i]); 
		//	System.out.println(substring[i]);
			
		}
		return substring;
	}
	
	public static void main(String args[])
	{
		
		
		String a="Strings,which are widely used in Java programming";
		
		String x[];
		
		int[] b ={2,6,10};
		int[] c ={10,15,20};
		
		int y=b.length;
		
		
		Substring obj=new Substring();
		x=obj.multiSearchString(a, b, c);
		
		for(int i=0;i<y;i++)
		{
		System.out.println(x[i]);
		}
	}

}
