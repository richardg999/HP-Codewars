import java.util.*;
import java.io.*;

public class prob09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob09-2-in.txt"));

		int l;
		int w;
		int h;
		while (true) {
			l = in.nextInt();
			w = in.nextInt();
			h = in.nextInt();
			if (l == 0)
				break;
			else if (l <= 2 || w <= 2 || h <= 2) {
				System.out.println("A " + l + "x" + w + "x" + h + " block is MORE than Perfect.");
				continue;
			}
			int inner = (l-2) * (w-2) * (h-2);
			int outer = l * w * h - inner;
			
			if (outer > inner)
				System.out.println("A " + l + "x" + w + "x" + h + " block is MORE than Perfect.");
			else if (outer == inner)
				System.out.println("A " + l + "x" + w + "x" + h + " block is PERFECT.");
			else 
				System.out.println("A " + l + "x" + w + "x" + h + " block is LESS than Perfect.");
		}
		in.close();
	}

}