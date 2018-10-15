import java.util.*;
import java.io.*;

public class prob10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob10-1-in.txt"));
		
		while (true) {
			String line = in.nextLine();
			if (!line.contains("X") && !line.contains("O")) break;
			
			char[][] arr = new char[3][3];
			for (int i = 0; i < 9; i++)
				arr[i / 3][i % 3] = line.charAt(i);
			
			if (checkrow(arr).length() > 0) {
				System.out.println("Player " + checkrow(arr) + " is the winner."); 
				print(arr); 
				continue;
			}
			else if (checkcol(arr).length() > 0) {
				System.out.println("Player " + checkcol(arr) + " is the winner."); 
				print(arr);
				continue;
			}
			else if (checkdiag1(arr).length() > 0) {
				System.out.println("Player " + checkdiag1(arr) + " is the winner."); 
				print(arr); 
				continue;
			}
			else if (checkdiag2(arr).length() > 0) {
				System.out.println("Player " + checkdiag2(arr) + " is the winner."); 
				print(arr); 
				continue;
			}
			else {
				System.out.println("There was a tie."); 
				print(arr);
			}
		}

		in.close();
	}
	
	public static void print(char[][] arr) {
		for (char[] x: arr)
		{
			for (char a: x) System.out.print(a);
			System.out.println();
		}
		System.out.println();
	}
	
	public static String checkdiag1(char[][] arr)
	{
		String l = "" + arr[0][0] + arr[1][1] + arr[2][2];
		if (l.contains("=") || l.contains("$")|| (l.contains("X") && l.contains("O"))) return "";
		filldiag1(arr);
		if (l.contains("O")) return "O";
		else return "X";
	}
	
	public static String checkdiag2(char[][] arr)
	{
		String l = "" + arr[0][2] + arr[1][1] + arr[2][0];
		if (l.contains("=") || l.contains("$")|| (l.contains("X") && l.contains("O"))) return "";
		filldiag2(arr);
		if (l.contains("O")) return "O";
		else return "X";
	}
	
	public static void filldiag1(char[][] arr)
	{
		for (int i = 0; i < 3; i++) arr[i][i] = '$';
	}
	
	public static void filldiag2(char[][] arr)
	{
		for (int i = 0; i < 3; i++) arr[i][3 - 1] = '$';
	}
	
	public static String checkrow(char[][] arr)
	{
		for (int i = 0; i < 3; i++)
		{
			String l = "" + arr[i][0] + arr[i][1] + arr[i][2];
			
			if (l.contains("=") || l.contains("$") || (l.contains("X") && l.contains("O"))) continue;
			fillrow(i, arr);
			if (l.contains("O")) return "O";
			return "X";
		}
		return "";
	}
	
	public static String checkcol(char[][] arr)
	{
		for (int i = 0; i < 3; i++)
		{
			String l = "" + arr[0][i] + arr[1][i] + arr[2][i];
			
			if (l.contains("=") || l.contains("$") || (l.contains("X") && l.contains("O"))) continue;
			fillcol(i, arr);
			if (l.contains("O")) return "O";
			return "X";
		}
		return "";
	}
	
	public static void fillrow(int r, char[][] arr)
	{
		for (int i = 0; i < 3; i++)  arr[r][i] = '$';
	}
	
	public static void fillcol(int r, char[][] arr)
	{
		for (int i = 0; i < 3; i++)  arr[i][r] = '$';
	}

}