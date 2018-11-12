import java.util.*;
public class ListDemo{
	public static void main(String[] args)
	{
		String[] names1={"George","Jim","John","Blake","Kevin","Michael"};
		String[] names2={"George","Katy","Kevin","Ryan","Michelle"};
		List<String> list1=Arrays.asList(names1);
		List<String> list2=Arrays.asList(names2);
		//union(list1,list2);
		intersection(list1,list2);
		//difference(list1,list2);	
	}

	static void intersection(List<String> list1,List<String> list2)
	{
		List<String> l=new ArrayList<String>();
	//	for(String value:list1)
	//		l.add(value);
		for(String value:list2)
		{
			if(list1.contains(value))
				l.add(value);
		}
		display(l);
	}
	static void display(List<String> list)
	{
		Iterator<String> it=list.iterator();

		for(String boobu : list)
		{
			System.out.println(boobu);
		}
	}
}
