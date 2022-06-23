import java.io.*;
import java.util.*;

public class USACOSpeeding {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("speeding.in"));
		PrintWriter out = new PrintWriter("speeding.out");

		StringTokenizer st = new StringTokenizer(in.readLine());
		int roadSegments = Integer.parseInt(st.nextToken());
		int journeySegments = Integer.parseInt(st.nextToken());

		int[] road = new int[100];
		int[] journey = new int[100];

		int startIndex = 0;

		for(int i = 0; i < roadSegments; i++) {
			
			st = new StringTokenizer(in.readLine());
			int dist = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());

			for(int j = startIndex; j < dist + startIndex; j++) {
				road[j] = speed;
			}

			startIndex += dist;
		}

		startIndex = 0;
		for(int i = 0; i < journeySegments; i++) {
			
			st = new StringTokenizer(in.readLine());
			int dist = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());

			for(int j = startIndex; j < dist + startIndex; j++) {
				journey[j] = speed;
			}

			startIndex += dist;
		}


		int maxSpeeding = 0;
		for(int i = 0; i < 100; i++) {
			maxSpeeding = Math.max(maxSpeeding, journey[i] - road[i]);
		}

		out.println(maxSpeeding);

		in.close();
		out.close();
	}
}