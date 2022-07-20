import java.util.*;
import java.io.*;

public class USACOCowCrossRoadII {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("circlecross.in"));
		PrintWriter out = new PrintWriter("circlecross.out");
		
		String str = in.readLine();
		//variable for counting the crossing pairs
		int count = 0;

		//iterating through all letters
		for(int i = 0; i < str.length(); i++){
			//finding the second instance of letter at index i
			int ind = ind(str, str.substring(i, i + 1));
			//looking at all of the letters after ind
			for(int j = ind+1; j < str.length(); j++){
				char c = str.charAt(j);
				//the index of the first instance of c needs to be sandwiched between ind and i
				if(str.indexOf(c) > i && str.indexOf(c) < ind){
					count++;
				}
			}
		}
		
		out.println(count);
		out.close();

	}
	
	//finding the second instance of a letter
	public static int ind(String str, String target){
		for(int i = str.length()-1; i >= 0; i--){
			if(str.substring(i, i + 1).equals(target)){
				return i;
			}
		}
		return -1;
	}

}
