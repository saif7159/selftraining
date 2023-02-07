import java.util.*;
public class FootballDriver{
	public static void main(String[] args){
		Football football1 = new Football(23,20);
		Football football2 = new Football(24,25);
		Football football3 = new Football(25,50);
		Football football4 = new Football(23,25);
		Football football5 = new Football(24,30);
		ArrayList<Football> list = new ArrayList<>();
		list.add(football1);
		list.add(football2);
		list.add(football3);
		list.add(football4);
		list.add(football5);
		Collections.sort(list, new Comparator<Football>(){
			public int compare(Football f1, Football f2){
				return f1.getAge() - f2.getAge();
			}
		});
		Iterator<Football> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().getAge());
		}
	}
}