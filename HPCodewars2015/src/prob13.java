import java.util.*;
import java.io.*;

public class prob13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob13-3-in.txt"));

		Set<String> set = generateSet();
		//System.out.println(set);
		
		List<Integer> ansList = new ArrayList<Integer>();
		
		String str = in.next();
		String testStr = "";
		int N = in.nextInt();
		/*for (int i = 0; i < str.length() - 1; i++) {
			testStr = str.charAt(i) + testStr;
			System.out.println(testStr);
			if (set.contains(testStr)) {
				//ansList.add(Integer.parseInt(testStr));
				testStr = "";
			}
			
		}*/
		int index = 0;
		while (index < str.length() - 1) {
			int endIndex = Math.min(str.length() - 1, index + 6);
			testStr = "";
			while (endIndex > index) {
				testStr = str.substring(index, endIndex);
				//System.out.println(testStr);
				if (set.contains(testStr)) {
					ansList.add(Integer.parseInt(testStr));
					testStr = "";
					break;
				}
				endIndex--;
			}
			index = endIndex;
		}
		while (ansList.size() < N) {
			int idx = ansList.indexOf(21);
			ansList.remove(idx);
			ansList.add(idx, 1);
			ansList.add(idx, 2);
		}
		//System.out.println(ansList);
		for (int ans : ansList) {
			System.out.println(ans);
		}
		

		in.close();
	}
	
	public static Set<String> generateSet() {
		Set<String> set = new HashSet<String>();
		int num = 0;
		while (num < 1000000) {
			num = num * 2 + 1;
			set.add(Integer.toString(num));
			num = num * 2;
			set.add(Integer.toString(num));
		}
		
		return set;
	}

}