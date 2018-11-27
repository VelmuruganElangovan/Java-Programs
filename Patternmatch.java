import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Patternmatch {

   public static void main( String args[] ) {
      // String to be scanned to find the pattern.
     
	  try
	  {
	   
	      String filename = "hello";
	
	      String keyword = null;
	      
	      String pattern = "vel@";//"[a-z]{5}";
	      
	    //  String line = "(.*";
	      
	      //(.*)(\\d+)(.*)
	      
	      Pattern r;
	      
	      // Create a Pattern object
	      r = Pattern.compile(pattern);
	
	      // Now create matcher object.
	     
	     // Matcher m = r.matcher(line);
	      
	
		 	/* if(Pattern.matches("[a-z]{5}",filename)==true )
		      {
		    	  System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYY   " );
		      }
		      else 
		      {
		    	  System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnn   " );
		      }
	  */
	 	  
	     
	      
	      
	      if(Pattern.matches("[a-zA-Z0-9@]+",pattern)==true)
	      {
	    	  System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYY   " );
	      }
	      else
	      {
	    	  System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnn   " );
	      }
	   
	      
	     
	   }
	   catch(PatternSyntaxException  e)
	   {
		   System.out.println(e);
	   }
		
     }
   }
