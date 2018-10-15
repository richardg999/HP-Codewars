import java.util.*;
import java.io.*;

public class prob12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob12-3-in.txt"));

		int N = in.nextInt();
		double[][] pile = new double[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				pile[i][j] = in.nextDouble();
			}
		}
		
		double max = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N; j++) {
				double temp = Math.abs(pile[i + 1][j] - pile[i][j]);
				if (temp > max)
					max = temp;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				double temp = Math.abs(pile[i][j + 1] - pile[i][j]);
				if (temp > max)
					max = temp;
			}
		}
		
		double max2 = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N - 1; j++) {
				double temp = Math.abs(pile[i + 1][j + 1] - pile[i][j]);
				if (temp > max2)
					max2 = temp;
			}
		}
		for (int i = 0; i < N - 1; i++) {
			for (int j = 1; j < N; j++) {
				double temp = Math.abs(pile[i + 1][j - 1] - pile[i][j]);
				if (temp > max2)
					max2 = temp;
			}
		}
		
		double finalMax = Math.max(max, max2 / Math.sqrt(2));
		
		double ans = Math.atan(finalMax) * 360 / (2 * Math.PI);
		System.out.printf("Max angle is %.2f degrees\n", ans);
		

		in.close();
	}

}