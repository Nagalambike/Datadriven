package Value;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		

			
				ArrayList l=new ArrayList();
				l.add(1);
				l.add(2);
				System.out.println(l);
				ArrayList l1=new ArrayList<>();
				l1.add(2);
				l1.add("java");
				l1.add('v');
				System.out.println(l1);
				l.addAll(l1);//adding l1 to l
				System.out.println(l);
				l1.remove(1);
				l1.add(0, 10);
				System.out.println(l1);
				


		}

	
}
