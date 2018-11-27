import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Interface {

	public static void main(String args[]) throws IOException, InterruptedException
	{
		
		String cmd = "ls /sys/class/net";

		Runtime run = Runtime.getRuntime();

		Process pr = run.exec(cmd);

		pr.waitFor();

		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));

		String line = "";

		while ((line=buf.readLine())!=null) {

			System.out.println("======>>>\n"+line);

		}
		
	}
}
