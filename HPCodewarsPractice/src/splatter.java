import java.util.*;
import java.io.*;

public class splatter {

	public static boolean[][] room;
	public static int R;
	public static int C;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("splatter.dat"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			R = in.nextInt();
			C = in.nextInt();
			int T = in.nextInt();
			room = new boolean[R][C];
			for (int i = 0; i < T; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				splatter(a, b);
				
			}
			//print2d(room);
			boolean flag = isFilled();
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		in.close();
	}
	
	public static void print2d(boolean[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void splatter(int ibase, int jbase) {
		for (int di = -2; di <= 2; di++) {
			int i = di + ibase;
			int dj = 2 - Math.abs(di);
			for (int j = jbase - dj; j <= jbase + dj; j++) {
				
				if (i < 0 || j < 0 || i >= R || j >= C)
					continue;
				room[i][j] = true;
			}
		}
	}
	
	public static boolean isFilled() {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (room[i][j] == false)
					return false;
			}
		}
		return true;
	}
	
}