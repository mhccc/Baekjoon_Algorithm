import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//for문 한번만 사용하여 해결 가능
//후에 수정해보기
public class Baekjoon_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int num = 26, index, max = 0;
		int[] ch = new int[num];
		char result = ' ';
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) > 90)
				index = str.charAt(i) - 97;
			else
				index = str.charAt(i) - 65;
				
			ch[index]++;
		}
		
		for(int i=0; i<num; i++) {
			if(max < ch[i]) {
				max = ch[i];
				result = (char) (i + 65);
			}
			else if(max == ch[i])
				result = '?';
		}
	
		System.out.println(result);
	}
}
