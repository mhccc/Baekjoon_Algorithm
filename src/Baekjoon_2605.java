import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] student = new int[n];
		String[] num = br.readLine().split(" ");
		int temp = 0;
		
		for(int i=0; i<n; i++) {
			student[i] = i+1;
		}
		
		for(int i=0; i<n; i++) {
			temp = student[i];
			for(int j=i; j>i-Integer.parseInt(num[i]); j--) {
				student[j] = student[j-1];
			}
			student[i-Integer.parseInt(num[i])] = temp;
		}
		
		for(int i=0; i<n; i++) {
			sb.append(student[i] + " ");
		}
		
		System.out.println(sb);
	}
}
