import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int count = 0;
		
		for(int i=0; i<str.length; i++) {
			if(!str[i].equals(""))
				count++;
		}
		
		System.out.print(count);
	}
}
