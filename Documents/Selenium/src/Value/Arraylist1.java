package Value;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		//Program to traverse arraylist
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(23);
		a1.add(15);
		a1.add(4);
		a1.add(7);
		//traverse arraylist through for loop
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
			
		}
			}

		

}
