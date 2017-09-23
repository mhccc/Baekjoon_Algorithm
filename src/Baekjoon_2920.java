import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon_2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().toString());
		
		int num = 8, count = 0;
		int[] arr = new int[num];
		boolean flag = false;
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<num-1; i++) {
			count += arr[i]-arr[i+1];
			if(Math.abs(arr[i]-arr[i+1]) != 1)
				flag = true;
		}
		
		if(flag) System.out.print("mixed");
		else if(count == num-1) System.out.print("descending");
		else System.out.print("ascending");
	}
}
