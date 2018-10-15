import java.util.*;
import java.math.*;
import java.io.*;

public class Pascal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("pascal.dat"));
		
		BigInteger[] fac = new BigInteger[31];
		fac[0] = new BigInteger("1");
		for (int i = 1; i < 31; i++)
		{
			BigInteger num = new BigInteger(Integer.toString(i));
			
			fac[i] = num.multiply(fac[i-1]);
		}
		
		
		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			in.nextLine();
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(fac[a].divide(fac[b].multiply(fac[a-b])));
		}

		in.close();
	}
	
	public static long factorial(long num)
	{
		if (num == 0)
			return 1;
		return num * factorial (num - 1);
	}
}