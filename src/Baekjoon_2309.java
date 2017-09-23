import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int[] arr =  new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		loop1 : for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				sum = 0;
				for(int k=0; k<9; k++) {
					if(k != i && k != j)
						sum += arr[k];
				}
				
				if(sum == 100) {
					for(int k=0; k<9; k++) {
						if(k != i && k != j) {
							System.out.println(arr[k]);
						}
					}
					
					break loop1;
				}
					
			}
		}
	}
}
