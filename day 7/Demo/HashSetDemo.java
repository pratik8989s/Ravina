package Demo;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo 
{
		public static void main(String[] args) 
		{
			HashSet hs=new HashSet();
			hs.add(10);
			hs.add("Rav");
			hs.add("Pari");
			System.out.println(hs);
			
			TreeSet t=new TreeSet();
			t.add("10");
			t.add("Rav");
			t.add("Pari");
			System.out.println(t);
		}
}
