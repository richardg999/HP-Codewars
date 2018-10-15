import java.util.*;
import java.io.*;

public class prob14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob14-1-in.txt"));
		
		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int L1 = in.nextInt();
			Point[] arr1 = new Point[L1 * 2];
			int sum = 0;
			for (int i = 0; i < L1; i++) {
				int num = in.nextInt();
				char c = in.next().charAt(0);
				sum += num;
				arr1[i] = new Point(c, 0);
				if (i == 0) continue;
				arr1[i - 1].value = num;
			}
			arr1[L1 -1].value = 360 - sum;
			for (int i = L1; i < L1 * 2; i++) {
				arr1[i] = arr1[i - L1];
			}
			//System.out.println(Arrays.toString(arr1));
			
			int L2 = in.nextInt();
			Point[] arr2 = new Point[L2 * 2];
			sum = 0;
			for (int i = 0; i < L2; i++) {
				int num = in.nextInt();
				char c = in.next().charAt(0);
				sum += num;
				arr2[i] = new Point(c, 0);
				if (i == 0) continue;
				arr2[i - 1].value = num;
			}
			arr2[L2 - 1].value = 360 - sum;
			for (int i = L2; i < L2 * 2; i++) {
				arr2[i] = arr2[i - L2];
			}
			//System.out.println(Arrays.toString(arr2));
			int flag = 2;
			if (arr1.length == arr2.length) {
				if (checkExact(arr1, arr2)) flag = 0;
			}
			else if (arr1.length < arr2.length) {
				if (checkPartial(arr1, arr2)) flag = 1;
			}
			else {
				if (checkPartial(arr2, arr1)) flag = 1;
			}
				
			if (flag == 0) {
				System.out.println("EXACT");
			}
			else if (flag == 1) {
				System.out.println("PARTIAL");
			}
			else {
				System.out.println("MISMATCH");
			}
			
		}
		

		in.close();
	}
	
	public static boolean checkExact(Point[] arr1, Point[] arr2) {
		int N = arr1.length / 2;
		char name = arr1[0].name;
		for (int i = 0; i < N; i++) {
			if (name == arr2[i].name) {
				for (int j = 0; j < N; j++) {
					if (arr2[i + j].name != arr1[j].name)
						return false;
					else if (arr2[i + j].value != arr1[j].value)
						return false;
				}
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkPartial(Point[] arr1, Point[] arr2) {
		int N = arr2.length / 2;
		char name = arr1[0].name;
		for (int i = 0; i < N; i++) {
			if (name == arr2[i].name) {
				int k = 0;
				int sum = 0;
				for (int j = 0; j < N; j++) {
					if (k == arr1.length / 2)
						return true;
					if (arr1[k].name == arr2[i + j].name) {
						if (k == 0 || arr1[k - 1].value == sum) {
							sum = 0;
							k++;
						}
						
					}
					if (k == arr1.length / 2)
						return true;
					sum += arr2[i + j].value;
				}
			}
		}
		return false;
	}
	
	static class Point {
		char name;
		int value;
		public Point(char name, int value) {
			this.name = name;
			this.value = value;
		}
		@Override
		public String toString() {
			return "" + name + ":" + value;
		}
	}
}