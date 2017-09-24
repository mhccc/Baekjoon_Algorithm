import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		int count = 0;
		
		out : for(int i=0; i<len; i++) {
			int n = Integer.parseInt(arr[i]);
			if(n < 2 ) {
				continue out;
			} else {
				for(int j=2; j<n; j++) {
					if(n%j == 0) {
						continue out;
					}
				}
				count++;
			}
		}
		
		System.out.println(count);
	}
}
