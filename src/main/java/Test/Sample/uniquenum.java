package Test.Sample;

import java.util.ArrayList;
import java.util.HashMap;

public class uniquenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,0,2,1,2,9,1,9,0};
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!al.contains(a[i]))
			
			{
			int counter=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
					counter=counter+1;
			}
		
			
			al.add(a[i]);
			al1.add(counter);
			
			}	
		}
		
		
		
		
		System.out.println(al);
		System.out.println(al1);
		
		
	}

}
