import java.util.*;
import java.io.*;

public class USACOBucketList {

	static final int maxTime = 1000;
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new FileReader("lostcow.in"));
		PrintWriter out = new PrintWriter("lostcow.out");
		
		int n = in.nextInt();

		int[] startTimes = new int[n + 1];
		int[] endTimes = new int[n + 1];
		int[] bucketsNeeded = new int[n + 1];

		// these track when the cows start
		int[] cowStart = new int[maxTime + 1];
		int[] cowEnd = new int[maxTime + 1];

		for (int x = 1; x <= n; x++) {
			startTimes[x] = in.nextInt();
			endTimes[x] = in.nextInt();
			bucketsNeeded[x] = in.nextInt();

			cowStart[startTimes[x]] = x;
			cowEnd[endTimes[x]] = x;
		}

		int maxBuckets = 0;
		int countBuckets = 0;

		for (int t = 1; t <= 1000; t++) {
			// is a start, increase the bucket count
			if (cowStart[t] > 0) {
				countBuckets += bucketsNeeded[cowStart[t]];
			}
			
			// keep track of the maximum buckets needed at any time
			maxBuckets = Math.max(maxBuckets, countBuckets);
			
			// is an end, decrease the bucket count
			if (cowEnd[t] > 0) {
				countBuckets -= bucketsNeeded[cowEnd[t]];
			}
		}

		out.println(maxBuckets);
		in.close();
		out.close();

	}

}
