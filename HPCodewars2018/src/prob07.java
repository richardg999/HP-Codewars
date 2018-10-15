import java.util.*;
import java.io.*;

public class prob07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob07.txt"));

		while(true)
		{
			int num = in.nextInt();
			if (num == 0) break;
			ArrayList<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
			for (int i = 0; i < num; i++)
			{
				int x = in.nextInt();
				if (x > 0) pos.add(x);
				else neg.add(x);
			}
			
			Collections.sort(pos); Collections.sort(neg);
			
			int possize = pos.size(), negsize = neg.size();
			ArrayList<Integer> ial = new ArrayList<>();
			if (possize > 2) ial.add(pos.get(possize - 1) * pos.get(possize - 2) * pos.get(possize - 3));
			if (possize > 0 && negsize > 1) ial.add(pos.get(possize - 1) * neg.get(0) * neg.get(1));
			if (negsize> 2) ial.add(neg.get(negsize - 1) * neg.get(negsize - 2) * neg.get(negsize - 3));
			if (possize > 1 && negsize > 0) ial.add(pos.get(possize - 1) * pos.get(possize - 2) * neg.get(negsize - 1));
			Collections.sort(ial);
			System.out.println(ial.get(ial.size() - 1));
			
		}

		in.close();
	}
}