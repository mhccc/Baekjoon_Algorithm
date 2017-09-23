import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine().toString();
		if(num.length()==1)
			num = "0" + num;
		
		String num2 = num;
		int count = 0, right, left;
		
		do {
			right = Integer.parseInt("" + num2.charAt(0));
			left = Integer.parseInt("" + num2.charAt(1));
			
			num2 = "" + left + (right+left)%10;
			
			count++;
		} while(!num.equals(num2));
		
		System.out.println(count);
	}
}
