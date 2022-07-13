import java.util.*;
import java.io.*;

public class USACOMilkPails {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("pails.in"));
		PrintWriter out= new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int x= Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int max = 0;
		int xmax = m/x;
		int ymax = m/y;
		
		for (int i = 0; i <= xmax; i++) {
			for (int j = 0; j<=ymax; j++) {
				if (i*x + j*y > max && i*x + j*y <= m) {
					max = i*x + j*y;
				}
			}
		}
		out.println(max);
		in.close();
		out.close();

	}

}
