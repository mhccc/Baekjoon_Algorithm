import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2742 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i=N; i>=1; i--) {
            sb.append(i + "\n");
        }
        System.out.println(sb.toString());
    }
}
