import java.util.*;
import java.io.*;

public class prob11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob11-2-in.txt"));

		
		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int num = in.nextInt();
			int[] skill = new int[num];
			String[] name = new String[num];
	
			in.nextLine();
			
			for (int i = 0; i < num; i++)
			{
				String line = in.nextLine();
				skill[i] = Integer.parseInt(line.substring(0,  line.indexOf(" ")));

				name[i] = line.substring(line.indexOf(" ") + 1);
			}
			
			int maxsum = Integer.MIN_VALUE;
			int maxs = 0, maxe = 0;
			for (int s = 0; s < num; s++)
			{
				for (int l = 1; l <= num - s; l++)
				{
					int thissum = 0;
				
					for (int i = s; i < s+l; i++)
					{
						thissum += skill[i];
					}
					
					if (thissum > maxsum) {maxs = s; maxe = s + l - 1;maxsum = thissum;}
					else if (thissum == maxsum && l > (maxs - maxe + 1)) {maxs = s; maxe = s+1-l;}
				}
			}
			
			if (maxsum < 0) System.out.println("None");
			else
			{
				if (maxe == maxs) System.out.println(name[maxs]);
				else 
					{
					if (maxe == 0) maxe = num - 1;

					System.out.println(name[maxs] + " to " + name[maxe]);
					}
		
			}
			/*
			int[] sums = new int[num+1];
			sums[0] = 0;
			
			int[][] intervals = new int[num][num];
			boolean allNeg = true;
			for (int i = 0; i < num; i++)
			{
				String line = in.nextLine();
				skill[i] = Integer.parseInt(line.substring(0,  line.indexOf(" ")));
				if (skill[i] > 0)
					allNeg = false;
				name[i] = line.substring(line.indexOf(" ") + 1);
				sums[i+1] = sums[i] + skill[i];
			}
			if (allNeg)
			{
				System.out.println("None");
				continue;
			}
			int maxJ = 0;
			int maxK = 1;
			int maxDiff = 0;
			for (int j = 0; j < num; j++)
				for (int k = 1; k < num; k++)
				{
					intervals[j][k] = 
							sums[k] - sums[j];
					if (intervals[j][k] > maxDiff)
					{
						maxDiff = intervals[j][k];
						maxJ = j;
						maxK = k;
					}
					if (intervals[j][k] == maxDiff && k - j > maxK - maxJ)
					{
						maxJ = j; maxK = k;
					}
				}
			if (maxK - maxJ == 1)
				System.out.println(name[maxJ]);
			else
				System.out.println(name[maxJ] + " to " + name[maxK]);
			
				
			*/
		}
	
		in.close();
	}
}