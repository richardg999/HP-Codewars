import java.util.*;
import java.io.*;

public class prob12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob12.txt"));
		
		ArrayList<ArrayList<Character>> orig = new ArrayList<>();
		ArrayList<String> origstring = new ArrayList<>();
		int N = in.nextInt(); in.nextLine();
		for (int idx = 0; idx < N; idx++) {
			String l = in.nextLine();
			origstring.add(l);
			char[] x = l.replace(" ", "").toCharArray();
			ArrayList<Character> add = new ArrayList<>();
			for (char h: x) add.add(h);
			Collections.sort(add);
			orig.add(add);
		}
		
		int cases = in.nextInt(); in.nextLine();
		for (int idx = 0; idx < cases; idx++)
		{
			char[] f = in.nextLine().replace(" ", "").toCharArray();
			ArrayList<Character> test=  new ArrayList<>();
			for (char x: f) test.add(x);
			
			Collections.sort(test);
			
			ArrayList<String> correct = new ArrayList<>();
			boolean print = false;
			for (int i = 0; i < N; i++)
			{
				if (test.equals(orig.get(i))) {
					print = true; 
					correct.add(origstring.get(i));
				}
			}
			
			if (!print) System.out.println("No: No matching case");
			else
			{
				Collections.sort(correct);
				System.out.println("Yes: " + correct.get(0));
			}
		}

		in.close();
	}
}