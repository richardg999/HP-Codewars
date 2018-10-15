import java.util.*;
import java.io.*;

public class prob16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob16-2-in.txt"));
		
		long starttime = System.currentTimeMillis();

		int N = in.nextInt();
		in.nextLine();
		ArrayList<Integer> def = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			def.add(i);
		for (int idx = 0; idx < N; idx++) {
			ArrayList<Integer> test = new ArrayList<>();
			ArrayList<Integer> prod = new ArrayList<>();
			
			long num = Long.parseLong(in.nextLine());
			//System.out.println(num);
			for (int i = 0; i < num/2+1; i ++)
			{
				test = new ArrayList<>();
				
				long a = i;
				long b = num - i;
				String comb = Long.toString(a) + Long.toString(b);
				//System.out.println(comb);
				for (int j = 0; j < comb.length(); j++)
					test.add(comb.charAt(j) - 48);
				Collections.sort(test);
				//System.out.println(test);
				if (def.equals(test))
				{
					prod = new ArrayList<>();
//					System.out.println(a + " " + b);
					long p = a * b;
					String product = Long.toString(a * b);
					for (int j = 0; j < product.length(); j++)
						prod.add(Integer.parseInt(Character.toString(product.charAt(j))));
					Collections.sort(prod);
					if (prod.equals(def)) {
						System.out.println(num + " : " + a + " * " + b + " = " + p);
						break;
					}
				}
			}
		}
		
		System.out.println((System.currentTimeMillis() - starttime) / 1000.0);

		in.close();
	}
}