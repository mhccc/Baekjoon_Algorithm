import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();
		int len = 0;
		
		for(int i=0; i<ch.length; i++) {
			len++;
			switch(ch[i]) {
			case '=' : len--; if(ch[i-2] == 'd') len--; break; 
			case '-' : len--; break;
			case 'j' : if(ch[i-1] == 'l' || ch[i-1] == 'n') len--; break;
			}
		}
		
		System.out.println(len);
	}
}
