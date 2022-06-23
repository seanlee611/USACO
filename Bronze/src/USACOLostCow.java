import java.io.*;
import java.util.*;

public class USACOLostCow {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(new FileReader("lostcow.in"));
		PrintWriter out = new PrintWriter("lostcow.out");
		int x = in.nextInt();
		int y = in.nextInt();

		int direction = 1;
		int totalDistance = 0;
		int directionDistance = 1;

		while (true) {
			// found bessie
			if ((direction == 1 && x <= y && y <= (x + directionDistance)) ||
				(direction == -1 && y <= x && (x - directionDistance <= y))) {

				totalDistance += Math.abs(y - x); // distance to bessie from original position
				out.println(totalDistance);
				break;
			}
			else { // did not find bessie yet
				totalDistance += (directionDistance * 2); // add to the distance count
				directionDistance *= 2; // double the distance
				direction *= -1; // switch directions
			}
		}

		in.close();

	}

}
