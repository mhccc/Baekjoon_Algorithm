import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0, result = 1;
		
		while(n > result) {
			count++;
			result += (6 * count);
		}
		
		System.out.println(count+1);
	}
}
