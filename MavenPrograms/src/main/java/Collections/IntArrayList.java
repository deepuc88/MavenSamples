package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IntArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(5);
		System.out.println(ob);
		if(ob.contains(2))
		{
			System.out.println("Number found");
		}
		else
			System.out.println("Number not found");
		
		Iterator<Integer> it = ob.iterator(); //iterator() method to list the element in proper sequence
		while (it.hasNext()) 
		{
			int i = it.next();
			if(i%2 == 0)
			{
				it.remove();
			}
			System.out.println(i);
			//System.out.println(it.next());	
			
		}
		System.out.println(ob);
	}
}
