import java.util.*;
import java.io.*;

public class prob03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob03-1-in.txt"));

		int N = in.nextInt(); 
		in.nextLine();
		for (int idx = 0; idx < N; idx++) {
			String line = in.nextLine();
			boolean like = false;
			
			for (int i = 0; i + 1 < line.length(); i++)
			{
				if (line.charAt(i) == line.charAt(i+1))
				{
					like = true;
					break;
				}
			}
			
			if (like) System.out.println("likes " + line);
			else System.out.println("hates " + line);
		} 

		in.close();
	}

}