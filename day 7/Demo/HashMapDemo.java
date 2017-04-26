package Demo;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
		public static void main(String[] args) 
		{
				HashMap<Integer, String> hm=new HashMap<Integer, String>();
				hm.put(2007, "Sarvesh");
				hm.put(2008, "Abhishek");
				//System.out.println(hm);
				
		
				/*Enumeration e=(Enumeration) hm.entrySet();
				while(e.hasMoreElements())
				{
					System.out.println(e.nextElement());
				}*/
				
				
				for(Map.Entry m:hm.entrySet()){  
					   System.out.println(m.getKey()+" "+m.getValue());  
					  }  
				
		}
}
