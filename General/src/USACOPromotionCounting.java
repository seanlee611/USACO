import java.io.*;
import java.util.*;

public class USACOPromotionCounting {

	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new FileReader("promote.in"));
		PrintWriter out = new PrintWriter("promote.out");

		String[] input = in.readLine().split(" ");
		int b1 = Integer.parseInt(input[0]);
		int b2 = Integer.parseInt(input[1]);
		input = in.readLine().split(" ");
		int s1 = Integer.parseInt(input[0]);
		int s2 = Integer.parseInt(input[1]);
		input = in.readLine().split(" ");
		int g1 = Integer.parseInt(input[0]);
		int g2 = Integer.parseInt(input[1]);
		input = in.readLine().split(" ");
		int p1 = Integer.parseInt(input[0]);
		int p2 = Integer.parseInt(input[1]);
		
		out.println((p2+g2+s2) - (p1+g1+s1));
		out.println((p2+g2) - (p1+g1));
		out.println(p2-p1);
		in.close();
		out.close();
		
	}

}
