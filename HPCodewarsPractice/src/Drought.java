import java.util.*;
import java.io.*;

public class Drought {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("drought.dat"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			double avg = in.nextDouble();
			
			double y1 = 0, y2 = 0;
			
			for (int i = 0; i < 12; i++) y1 += in.nextDouble();
			for (int i = 0; i < 12; i++) y2 += in.nextDouble();
			
			if (y1 >= avg * 2 && y2 >= avg *2) System.out.println("drought over");
			else if (y1 >= avg && y2 >= avg) System.out.println("improving");
			else System.out.println("continuing");
		}

		in.close();
	}
}