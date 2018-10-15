/*
ID: richgtx1
LANG: JAVA
TASK: Template
*/
import java.util.*;
import java.io.*;

public class Template {

	public static Set<Integer> primes;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("Template.in"));
		//PrintWriter out = new PrintWriter("Template.out");
		//BufferedReader br = new BufferedReader(new FileReader("Template.in"));
		primes = new TreeSet<Integer>();
		long start = System.currentTimeMillis();
		generatePrimes(1000000);
		long end = System.currentTimeMillis();
		//System.out.println(end - start);
		//System.out.println(primes);
		
		String pal = "abc";
		String reversePal = new StringBuilder(pal).reverse().toString();
		System.out.println(reversePal);

		//in.close();
		//out.close();
		//br.close();
	}
	
	public static void generatePrimes(int max) {
		boolean[] arr = new boolean[max + 1];
		Arrays.fill(arr, true);
		for (int i = 2; i <= max; i++) {
			if (arr[i] == true) {
				primes.add(i);
				for (int j = i; j <= max; j += i) {
					arr[j] = false;
				}
			}
		}
	}
	
	public static boolean checkPrime(int num) {
		for (int prime : primes) {
			if (num % prime == 0 && num != prime) {
				return false;
			}
		}
		return true;
	}
	
	public static void BFS() {
		Queue<Node> q = new LinkedList<Node>();
		/*
		int[] arr = new int[V];
		boolean[] arr2 = new boolean[G];
		Node node = new Node(arr, arr2, -1);
		q.add(node);
		
		
		while (!node.isDone()) {
			node = q.poll();
			boolean[] previous = node.previous;
			for (int i = node.index + 1; i < previous.length; i++) {
				if (!previous[i]) {
					previous[i] = true;
					q.add(new Node(sumArrays(feed[i], node.values), previous, i));
					previous[i] = false;
				}
			}
			
		}
		*/
	}
	
	static class Point implements Comparable<Point> {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return x + "," + y;
		}
		public int compareTo(Point p) {
			if (this.y != p.y) {
				return this.y - p.y;
			}
			else {
				return this.x - p.x;
			}
		}
		public boolean equals(Point p) {
			return this.x == p.x && this.y == p.y;
		}
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
	
	static class Node {
		int[] values;
		boolean[] previous;
		int index;
		public Node(int[] arr, boolean[] arr2, int index) {
			values = Arrays.copyOf(arr, arr.length);
			previous = Arrays.copyOf(arr2, arr2.length);
			this.index = index;
		}
		public boolean isDone() {
			//fill with code
			return true;
		}
		@Override
		public String toString() {
			int count = 0;
			String ans = "";
			for (int i = 0; i < previous.length; i++) {
				boolean flag = previous[i];
				if (flag == true) {
					count++;
					ans += " " + (i + 1);
				}
			}
			return count + ans;
		}
	}
	
	public static int[] di = {0, 1, 0, -1};
	public static int[] dj = {1, 0, -1, 0};
	public static String[][] maze;
	public static boolean[][] checked;
	
	public static boolean floodfill(int a, int b) {
		if (a < 0 || b < 0 || a >= maze.length || b >= maze[a].length)
			return false;
		else if (maze[a][b].equals("*"))
			return false;
		else if (checked[a][b] == true)
			return false;
		else if(maze[a][b].equals("X"))
			return true;
		
		checked[a][b] = true;
		
		for(int i = 0; i < 4; i++) {
			boolean test = floodfill(a + di[i], b + dj[i]);
			if (test == true) {
				return true;
			}
			
		}
		maze[a][b] = " ";
		return false;
		
	}
	
	static boolean valid(int x, int y, int dx, int dy, int r, int c)
	{
		if (x + dx < 0 || x + dx >= r || y + dy < 0 || y + dy >= c) return false;
		return true;
	}
	
	static void fill(boolean[][] arr, int x, int y)
	{
		arr[x][y] = false;
		
		for (int i = 0; i < 4; i++)
		{
			if(!valid(x, y, di[i], dj[i], arr.length, arr[0].length)) continue;
			if (!arr[x + di[i]][y + dj[i]]) continue;
			fill(arr, x + di[i], y + dj[i]);
		}
	}
	
	static void flower(boolean[][] arr, int[][] path, int x, int y)
	{
		arr[x][y] = false;
		
		for (int i = 0; i < 4; i++)
		{
			if (!valid(x, y, di[i], dj[i], arr.length, arr[0].length)) continue;
			if (!arr[x+di[i]][y+dj[i]] && path[x+di[i]][y+dj[i]] <= path[x][y] + 1) continue;
			if (path[x+di[i]][y+dj[i]] == 0 || path[x+di[i]][y+dj[i]] > path[x][y] + 1)
				path[x + di[i]][y + dj[i]] = path[x][y] + 1;
			flower(arr, path, x + di[i], y + dj[i]);
		}
	}
	
	public static void print2d(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
