import java.util.*;
import java.io.*;

public class USACOSpeed {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new FileReader("speeding.in"));
		PrintWriter out = new PrintWriter("speeding.out");
		
		ArrayList<Integer> road = new ArrayList<Integer>(100);
		ArrayList<Integer> bessie = new ArrayList<Integer>(100);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			int length = in.nextInt();
			int speed = in.nextInt();
			
			for(int j = 0; j < length; j++) {
				road.add(speed);
			}
		}
		
		for(int i = 0; i < m; i++) {
			int length = in.nextInt();
			int speed = in.nextInt();
			
			for(int j = 0; j < length; j++) {
				bessie.add(speed);
			}
		}
		
		int currSpeedDiff = 0;
		int maxSpeedDiff = 0;
		
		for(int i = 0; i < 100; i++) {
			if(bessie.get(i) > road.get(i)) {
				currSpeedDiff = bessie.get(i) - road.get(i);
			}
			if(currSpeedDiff > maxSpeedDiff) {
				maxSpeedDiff = currSpeedDiff;
			}
		}
		
		if(currSpeedDiff == 0) {
			out.println(0);
		}
		else {
			out.println(maxSpeedDiff);
		}

		in.close();
		out.close();
		
	}

}
