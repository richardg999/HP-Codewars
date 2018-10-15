import java.util.*;
import java.io.*;

public class prob03 {
	
	public static Set<Integer> primes;
	public static boolean[] notprimes;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob03.txt"));
		generatePrimes(10000000);

		while (true)
		{
			String l = in.nextLine();
			if (l.equals("0")) break;
			
			boolean mag = true;
			for (int i = 0; i + 1 < l.length(); i++)
			{
	//			System.out.println(l.substring(i+1));
				if (notprimes[Integer.parseInt(l.substring(0, i+1)) + Integer.parseInt(l.substring(i+1))])
				{
					mag = false;
					break;
				}
			}
			
			if (mag) System.out.println(l + " MAGNANIMOUS");
			else System.out.println(l + " PETTY");
		}
		in.close();
	}
	
	public static void generatePrimes(int max) {
		notprimes = new boolean[max + 1];
		notprimes[0] = true; notprimes[1] = true;
		for (int i = 2; i <= max; i++) {
			if (notprimes[i]) continue;
			for (int k = (int)Math.pow(i, 2); k < max + 1; k += i)
				notprimes[k] = true;
		}
	}
}