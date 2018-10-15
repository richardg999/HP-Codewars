import java.util.*;
import java.io.*;

public class prob02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob02-1-in.txt"));

		while (true)
		{
			int gallons = in.nextInt();
			if (gallons == 0) break;
			System.out.println(gallons + " gallons per week will last " + (10000 / gallons) + " weeks");
		}

		in.close();
	}

}