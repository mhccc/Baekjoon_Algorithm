import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
	
		for(int i=1; i<=str.toString().length(); i++) {
			sb.append(str.charAt(i-1));
			
			if(i%10 == 0)
				sb.append("\n");
		}
		
		System.out.print(sb);
	}
}