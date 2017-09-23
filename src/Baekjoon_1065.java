import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(hansoo(br.readLine()));
	}
	
	static int hansoo(String str) {
		int num = Integer.parseInt(str), count = 0;
		int[] arr = new int[3];
		
		for(int i=num; i>=1; i--) {
			if(i == 1000) continue;
			else if(i < 100) count++;
			else {
				arr[0] = i/100;
				arr[1] = i%100/10;
				arr[2] = i%10;
				
				if((arr[0]-arr[1]) == (arr[1]-arr[2]))
					count++;
			}
		}
		
		return count;
	}
}
