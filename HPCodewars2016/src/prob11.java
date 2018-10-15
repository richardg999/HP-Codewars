import java.util.*;
import java.io.*;
import java.awt.geom.*;
import javafx.util.*;

public class prob11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob11-1-in.txt"));

		double a;
		double b; 
		double c;
		Point p = new Point(3, 5);
		Point e = new Point(3, 5);
		Point d = new Point(4, 3);
		System.out.println(p.hashCode() + " " + e.hashCode() + " " + d.hashCode());
		while (true)
		{
			a = in.nextDouble();
			b = in.nextDouble();
			c = in.nextDouble();
			if (a == 0 && b == 0 && c == 0)
				break;
			/*a = 1/a;
			b = 1/b;
			c = 1/c;
			double ratio = a/(a+b);
			double x12 = 100 * ratio - 100;
			double y12 = 200 * ratio - 100; 
			double x12o = 100 * a/(b-a);
			double y12o = 100 + 200 * a/(b-a);
			double r2 = (Math.pow(x12o-x12, 2)+Math.pow(y12o - y12, 2))/4;
			//Ellipse2D.Double appCircle12 = new Ellipse2D.Double(x12o - x12, y12o - y12, r2);*/
			
			for (int i = -100; i <= 100; i++) {
				for (int j = -100; j <= 100; j++) {
					
				}
			}
			
		}

		in.close();
	}
	
	static class Point implements Comparable<Point>{
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

}