import java.io.*;
 
public class Replace
    {
     public static void main(String args[])
         {
    	 
    	 String filepath ="/home/sets/test.txt";
         try
             {
        	 
             File file = new File(filepath);
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line = "";

             
             StringBuilder oldtext=new StringBuilder("");  
//oldtext = "";
             while((line = reader.readLine()) != null)
             {
                 oldtext.append(line + "\n");
             }
             
             System.out.println("==>>"+oldtext);
                 
             reader.close();
             
             
             int index = oldtext.indexOf("eth0");
             
             System.out.println("==>>"+index);

             
             if(index>=0)
             {
            	 StringBuilder newtext=null;  	 
            	 System.out.println("*********");
            	 
	              newtext = oldtext.replace(77, 92,"192.168.2.131");
	              newtext = oldtext.replace(111, 126,"192.168.2.131");
	 
	             FileWriter writer = new FileWriter("/home/sets/test.txt");
	             writer.write(newtext.toString());
	             writer.close();
	             
             }
            
           }
         catch (IOException ioe)
             {
             ioe.printStackTrace();
         }
     }
}