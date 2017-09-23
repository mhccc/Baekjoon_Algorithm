import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int max = 0, sum = 0, sco;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			sco = Integer.parseInt(st.nextToken());
			
			sum += sco;
			
			if(max < sco)
				max = sco;
		}
		
		System.out.printf("%.2f", ((float)sum/max*100)/n);
		
	}
}
