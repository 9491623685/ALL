package Java;
import java.util.*;
public class collection {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(101);
		values.add(919);
		values.add(812);
		values.remove(1);
		values.add(2,744);
		Comparator<Integer> com=new Compara();
	    Collections.sort(values, com);
	   // Collections.reverse(values); 
		for(int i1:values)
		{
			System.out.println(i1);
		}	
		
	}
}
