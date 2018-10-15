import java.util.*;
import java.io.*;

public class Microwave {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("microwave.dat"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int num = in.nextInt();
			
			int min = 0, sec = 0;
			
			if (num / 100 > 0)
			{
			//	System.out.println(Integer.toString(num));
				min = Integer.parseInt(Integer.toString(num).substring(0, Integer.toString(num).length() - 2));
				sec = Integer.parseInt(Integer.toString(num).substring(Integer.toString(num).length() - 2));
				System.out.printf("%d seconds = %02d:%02d minutes.\n", (60 * min) + sec, min, sec);
			}
			else
			{
				System.out.printf("%d seconds = %02d:%02d minutes.\n", num, num / 60, num % 60);
			}
		}

		in.close();
	}
}