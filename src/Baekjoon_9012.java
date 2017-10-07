import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		char[] arr;
		int top;
		for(int i=0; i<testCase; i++) {
			arr = br.readLine().toCharArray();
			top = 0;
			outer : for(int j=0; j<arr.length; j++) {
				switch(arr[j]) {
				case '(':
					top++; break;
				case ')':
					top--;
					if(top < 0) break outer;
					break;
				}
			}
			
			if(top == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
