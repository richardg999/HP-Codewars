import java.util.*;
import java.io.*;

public class prob04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob04.txt"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int g = in.nextInt(), s = in.nextInt(), b = in.nextInt();
			
			if (b % 5 == 0) {s += (b - 5) / 5; b = 5;}
			else {s += Math.floor(b / 5.0); b -= Math.floor(b / 5.0) * 5;}
			
			//System.out.println("--" + b + " " + s);
			if (s % 10 == 0) { g += (s - 10) / 10; s = 10;}
			else { g += Math.floor(s / 10.0); s -= Math.floor(s / 10.0) * 10;}
			
			System.out.println(g + " "  + s + " " + b);
			
			
		}

		in.close();
	}
}