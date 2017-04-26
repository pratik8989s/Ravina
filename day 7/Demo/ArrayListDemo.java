package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{
		public static void main(String[] args)
		{
				ArrayList a=new ArrayList();
				a.add(10);
				a.add("Ravi");
				a.add(1.50);
				a.add('A');
			//	System.out.println(a);
				System.out.println("size= "+a.size());
				for(int i=0;i<a.size();i++)
				{
					System.out.println(a.get(i));
				}
				System.out.println("\n\n\n");
				Iterator i=a.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
		}
}
