import java.util.*;
import java.io.*;

public class USACOCowSignal {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader(new File("cowsignal.in")));
		PrintWriter out = new PrintWriter(new FileWriter(new File("cowsignal.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		char[][] design = new char[m][n];
		
		for(int i = 0; i < m; i++) {
			
			String s = in.readLine();
			for(int j = 0; j < n; j++)
				design[i][j] = s.charAt(j);
			
		}
		
		for(int a = 0; a < m; a++) {
			for(int b = 0; b < k; b++) {
				for(int c = 0; c < n; c++)
					for(int d = 0; d < k; d++)
						out.print(design[a][c]);
				out.println();
			}
		}
		in.close();
		out.close();
	}
}