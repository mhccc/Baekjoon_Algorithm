import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Baekjoon_4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			String[] arr = br.readLine().toString().split(" ");
			
			int sum = 0, count = 0;
			double num = Double.parseDouble(arr[0]), avg = 0;
			
			for(int j=1; j<=num; j++) {
				sum += Integer.parseInt(arr[j]);
			}
			
			avg = sum/num;
			
			for(int j=1; j<=Integer.parseInt(arr[0]); j++) {
				if(avg < Double.parseDouble(arr[j]))
					count++;
			}
			
			sb.append(String.format("%.3f%%\n", count/num*100));
		}
        
        System.out.print(sb);
	}
}
