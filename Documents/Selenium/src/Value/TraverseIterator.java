package Value;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseIterator {

		public static void main(String[] args) {
			ArrayList<String> a=new ArrayList<>();
			a.add("nalini");
			a.add("manoj");
			a.add("nagu");
			a.add("nagraj");
			//create iterator to traverse
			Iterator<String> itr=a.iterator() ;
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
}
