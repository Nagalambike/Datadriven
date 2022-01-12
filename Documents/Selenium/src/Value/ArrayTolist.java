package Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
		a.add("java");
		a.add("manual");
		a.add("sql");
	//System.out.println(a);
//Arraylist to array
		String[] str=a.toArray(new String[a.size()]);
			
		for(String s:str)
		{
		System.out.println(s);	
		}
// array to arraylist
		List<String>a1=new ArrayList<>();
		a1=Arrays.asList(str);
		System.out.println(a1);
	

	}

}
