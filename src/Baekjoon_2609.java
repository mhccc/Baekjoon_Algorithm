import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		int x = Integer.parseInt(num[0]), y = Integer.parseInt(num[1]);
		
		int n = gcd(x, y);
		System.out.println(n);
		System.out.println(x*y/n);
	}
	
	public static int gcd(int x, int y) {
		if(y == 0) return x;
		return gcd(y, x%y);
	}
}
