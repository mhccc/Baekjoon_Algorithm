import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Baekjoon_1924 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int month = Integer.parseInt(st.nextToken());
		int date = Integer.parseInt(st.nextToken());
		int num = 0;
		
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] sMonth = {4, 6, 9, 11};
		int[] lMonth = {1, 3, 5, 7, 8, 10 , 12};
		
		for(int i=1; i<month; i++) {
			if(Arrays.binarySearch(sMonth, i) >= 0) {
				num += 30;
			} else if(Arrays.binarySearch(lMonth, i) >= 0) {
				num += 31;
			} else {
				num += 28;
			}
		}
		
		num += date;
		
		System.out.println(day[num%7]);
	}
}
