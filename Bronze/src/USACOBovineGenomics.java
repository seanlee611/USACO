import java.util.*;
import java.io.*;

public class USACOBovineGenomics {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File("cownomics.in"));
		PrintWriter out = new PrintWriter("cownomics.out");
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		char[][] spotted = new char[N][];
		char[][] plain = new char[N][];
		for (int i = 0; i < N; i++) {
			spotted[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < N; i++) {
			plain[i] = sc.next().toCharArray();
		}

		int ans = 0;
		for (int i = 0; i < M; i++) {
			
			boolean contains = false;
			HashSet<Character> a = new HashSet<>();

			for (int j = 0; j < N; j++) {
				a.add(plain[j][i]); // Go to column j at position i
			}

			for (int j = 0; j < N; j++) {
				if (a.contains(spotted[j][i])) {
					contains = true;
					break;
				}
			}

			ans += !contains ? 1 : 0;
		}

		
		out.println(ans);
		out.close();

	}

}
