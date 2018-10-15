import java.util.*;
import java.io.*;

public class prob07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob07-1-in.txt"));

		int N = in.nextInt();
		for (int idx = 0; idx < N; idx++) {
			
			String word1 = in.next();
			String word2 = in.next();
			String word3 = in.next();
			
			// generate charList1 out of chars in word1
			char[] arr = word1.toCharArray();
			List<Character> charList = new ArrayList<>();
			for (char c: arr) {
				charList.add(c);
			}
			
			// identify the chars in both charList1 and word2, put these chars in charList2
			List<Character> charList2 = new ArrayList<Character>();
			for (int i = 0; i < word2.length(); i++) {
				
				char let = word2.charAt(i);
				for (int j = charList.size() - 1; j >= 0; j--) {
					if (let == charList.get(j)) {
						charList2.add(let);
						charList.remove(j);
						break;
					}
				}
			}
			
			// identify the chars in both charList2 and word3, put these in charList3
			List<Character> charList3 = new ArrayList<Character>();
			for (int i = 0; i < word3.length(); i++) {
				char let = word3.charAt(i);
				for (int j = charList2.size() - 1; j >= 0; j--) {
					if (let == charList2.get(j)) {
						charList3.add(let);
						charList2.remove(j);
						break;
					}
				}
			}
			
			// sort and print out the answer
			Collections.sort(charList3);
			String ans = "";
			for (char c : charList3) {
				ans += c;
			}
			ans = ans.trim();
			System.out.println(ans);
			
		}

		in.close();
	}

}