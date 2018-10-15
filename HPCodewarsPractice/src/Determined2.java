import java.util.*;
import java.io.*;

public class Determined2 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(new File("determined2.dat"));

		int N = in.nextInt(); in.nextLine();
		for (int idx = 0; idx < N; idx++) 
		{
			String l = in.nextLine();
			String[] k = l.split(" ");
			int num = k.length;
			
			int[][] arr = new int[num][num];
			
			for (int y = 0; y < num; y++) arr[0][y] = Integer.parseInt(k[y]);
			
			for (int u = 1; u < num; u++)
			{
				k = in.nextLine().split(" ");
				for (int y = 0; y < num; y++) arr[u][y] = Integer.parseInt(k[y]);
			}
			
			System.out.println(det(arr));
		}

		in.close();
	}
	
	public static int det(int[][] arr)
	{
		if (arr.length == 2)
			return arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];
		int n = arr.length;
		int[][] newArr = new int[n-1][n-1];
		int out = 0;
		for (int i = 0; i < n; i++)
		{
			int k = 0;
			for (int j = 0; j < n-1; j++)
			{
				k = 0;
				for (int l = 0; l < n-1; l++)
				{
					if (k == i)
						k++;
					newArr[j][l] = arr[j+1][k];
					k++;
				}
			}
			out += Math.pow(-1, i) * arr[0][i] * det(newArr);
		}
		return out;
	}
}