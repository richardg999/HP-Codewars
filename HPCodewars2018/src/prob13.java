import java.util.*;
import java.io.*;

public class prob13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob13.txt"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int n = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			int[] r = new int[n];
			for (int i = 0; i < n; i ++)
			{
				in.nextLine();
				x[i] = in.nextInt(); y[i] = in.nextInt(); r[i] = in.nextInt();
			}
			int l = in.nextInt();
			int w = in.nextInt();
			int[][] stu = new int[l][w];
			in.nextLine();
			for (int j = 0; j < l; j++)
			{
				char[] line = in.nextLine().toCharArray();
				for (int k = 0; k < w; k++)
				{
					if (line[k] == '#')
						stu[j][k] = 1;
				}
			}
			int total = 0;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < l; j++)
				{
					for (int k = 0; k < w; k++)
					{
						if (stu[j][k] == 1 && Math.pow(x[i] - j, 2) + Math.pow(y[i] - k, 2) < Math.pow(r[i], 2))
						{
							stu[j][k] = 2;
							total ++;
						}
					}
				}
			}
//			System.out.println(Arrays.toString(x));
//			System.out.println(Arrays.toString(y));
//			System.out.println(Arrays.toString(r));
//			for (int i = 0; i < l; i++)
//				System.out.println(Arrays.toString(stu[i]));

			if (total == 1)
				System.out.println("Site " + (idx + 1) + ": 1 student gets coverage");
			else
				System.out.println("Site " + (idx + 1) + ": " + total + " students get coverage");
		}

		in.close();
	}
}