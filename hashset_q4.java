import java.util.*;
public class hashset_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <Integer> set=new HashSet<>();
set.add(2);
set.add(22);
set.remove(2);
set.size();
Iterator i=set.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
System.out.println(set);
set.contains(5);
set.toArray();

	}

}
