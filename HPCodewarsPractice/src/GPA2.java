import java.util.*;
import java.io.*;

public class GPA2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("GPA2.dat"));

		int N = in.nextInt();
		in.nextLine();
		for (int idx = 0; idx < N; idx++) {
			List<Integer> a = new ArrayList<Integer>();
			List<Integer> b = new ArrayList<Integer>();
			String line = in.nextLine();
			Scanner scan = new Scanner(line);
			while(scan.hasNext())
				a.add(scan.nextInt());
			scan.close();
			line = in.nextLine();
			scan = new Scanner(line);
			while(scan.hasNext())
				b.add(scan.nextInt());
			Collections.sort(a);
			Collections.sort(b);
			
			double testAvg;
			double hwkAvg;
			int testSum = 0;
			int hwkSum = 0;
			for (int n : a)
				hwkSum += n;
			hwkSum -= a.get(0);
			for (int n : b)
				testSum += n;
			hwkAvg = Math.round(((double)hwkSum/(a.size() - 1) +(double)testSum/b.size())/2.0);
			//System.out.println((double)hwkSum/(a.size() - 1) + " " + (double)testSum/b.size());
			hwkSum += a.get(0);
			testSum -= b.get(0);
			testAvg = Math.round(((double)hwkSum/a.size()+(double)testSum/(b.size() - 1))/2.0);
			System.out.println((int)Math.max(hwkAvg,  testAvg));
		}

		in.close();
	}
}