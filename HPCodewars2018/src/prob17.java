import java.util.*;
import java.io.*;

public class prob17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("prob17.txt"));

		ArrayList<String> a = new ArrayList<>(), b = new ArrayList<>(), c = new ArrayList<>();
		ArrayList<String> recv = new ArrayList<>();
		int train = 1;
		while (true)
		{
			String l = in.nextLine();
			if (l.equals("DONE")) break;
			
			if (l.startsWith("RECV"))
				recv.add(l.substring(l.indexOf(" ") + 1));
			else if (l.startsWith("LOAD"))
			{
				char plat = l.charAt(l.length() - 1);
				if (plat == 'A') a.add(recv.remove(0));
				else if (plat == 'B') b.add(recv.remove(0));
				else c.add(recv.remove(0));
			}
			else if (l.startsWith("XFER"))
			{
				char f = l.charAt(l.indexOf(" ") + 1);
				char g = l.charAt(l.length() - 1);
				
				if (f == 'A')
				{
					if (g == 'B') b.add(a.remove(a.size() - 1));
					else c.add(a.remove(a.size() - 1));
				}
				else if (f == 'B')
				{
					if (g == 'A') a.add(b.remove(b.size() - 1));
					else c.add(b.remove(b.size() - 1));
				}
				else if (f == 'C')
					{
						if (g == 'B') b.add(c.remove(c.size() - 1));
						else a.add(c.remove(c.size() - 1));
					}
			}
			else
			{
				System.out.println("VACTRAIN " + train);
				char h = l.charAt(l.length() - 1);
				if (h == 'A')
					while (!a.isEmpty())
						System.out.println(a.remove(a.size() - 1));
				if (h == 'B')
					while (!b.isEmpty())
						System.out.println(b.remove(b.size() - 1));
				if (h == 'C')
					while (!c.isEmpty())
						System.out.println(c.remove(c.size() - 1));
				train++;
			}
			
		}

		in.close();
	}
}