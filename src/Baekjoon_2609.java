import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		int n = gcd(x, y);
		System.out.println(n);
		System.out.println(x*y/n);
	}
	
	public static int gcd(int x, int y) {
		if(y == 0) return x;
		return gcd(y, x%y);
	}
}
