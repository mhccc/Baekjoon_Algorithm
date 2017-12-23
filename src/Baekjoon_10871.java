import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			y = Integer.parseInt(st.nextToken());
			if(y < x) {
				sb.append(y + " ");
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}