import java.util.*;
import java.io.*;

public class USACODiamondCollector {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("diamond.in"));
		PrintWriter out = new PrintWriter(new FileWriter("diamond.out"));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
		  list.add(Integer.parseInt(in.readLine()));
		}
		
		ArrayList<Integer> counterList = new ArrayList<Integer>();
		Collections.sort(list);
		
		for(int i = 0; i < N; i++){
			int init = list.get(i);
			int counter = 1;
			for(int j = i + 1; j < N; j++){
				if(list.get(j) - init <= K){
					counter++;
				}
			}
			counterList.add(counter);
		}
		out.println(Collections.max(counterList));
		out.close();

	}

}
