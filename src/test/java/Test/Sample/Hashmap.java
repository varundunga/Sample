package Test.Sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"2");
		hm.forEach((k,v) -> {
			System.out.println(k);
			System.out.println(v);});
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry) i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}

}
