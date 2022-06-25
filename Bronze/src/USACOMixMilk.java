import java.util.*;
import java.io.*;

public class USACOMixMilk {
	
	static int N = 3;
	static int[] capacity = new int[N];
	static int[] milk = new int[N];

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(new FileReader("mixmilk.in"));
		PrintWriter out = new PrintWriter("mixmilk.out");
		
		for(int i = 0; i < N; i++) {
			capacity[i] = in.nextInt();
			milk[i] = in.nextInt();
		}
		
		for(int i = 0; i < 100; i++) {
			pour(i % N, (i + 1) % N);
		}
		
		for(int i = 0; i < N; i++) {
			out.println(milk[i]);
		}
		
		in.close();
		out.close();

	}
	
	public static void pour(int i, int j) {
		//Amount of milk to pour is the minimum of remaining milk in bucket i
		//and the available capacity in bucket j
		int amount = Math.min(milk[i], capacity[j]-milk[j]);
		milk[i] -= amount;
		milk[j] += amount;
		
	}

}
