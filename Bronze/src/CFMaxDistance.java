import java.util.*;

public class CFMaxDistance {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			y[i] = in.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; j++) {
				
				int dx = x[i] - x[j];
				int dy = y[i] - y[j];
				max = Math.max(max,  dx*dx + dy*dy);
				
			}
			
		}
		
		System.out.println(max);

	}

}
