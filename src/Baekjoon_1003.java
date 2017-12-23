import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_1003 {
	static int zCnt;
	static int oCnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			zCnt = 0;
			oCnt = 0;
			fibonacci(Integer.parseInt(br.readLine()));
			sb.append(zCnt + " " + oCnt + "\n");
		}
		System.out.println(sb);
	}
	
	private static void fibonacci(int n) {
		if (n==0) {
			zCnt++;
		} else if (n==1) {
			oCnt++;
		} else {
			fibonacci(n-1);
			fibonacci(n-2);
		}
	}
}
