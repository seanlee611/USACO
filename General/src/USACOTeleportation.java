import java.io.*;

public class USACOTeleportation {

	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new FileReader("teleport.in"));
		PrintWriter out = new PrintWriter("teleport.out");
		
		String[] input = in.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int x = Integer.parseInt(input[2]);
		int y = Integer.parseInt(input[3]);
		
		//Case 1: a->b
		int ans = Math.abs(a-b);
		
		//Case 2: a->x->y->b
		ans = Math.min(ans,  Math.abs(a-x) + Math.abs(b-y));
		
		//Case 3: a->y->x->b
		ans = Math.min(ans,  Math.abs(a-y) + Math.abs(b-x));
		
		
		out.println(ans);
		in.close();
		out.close();

	}

}
