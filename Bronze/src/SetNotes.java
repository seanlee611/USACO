import java.util.*;

public class SetNotes {

	public static void main(String[] args) {
		
		TreeSet<Character> singleCow = new TreeSet<Character>();
		
		singleCow.add('C');
		singleCow.add('C');
		singleCow.add('A');
		
		System.out.println(singleCow.size());
		System.out.println(singleCow.first());
		System.out.println(singleCow.last());

	}
	
	public static TreeSet<Character> returnSet(int a, String s) {
		return null;
	}

}
