import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=9; i++) {
            sb.append(N + " * " + i + " = " + N*i + "\n");
        }
        
        System.out.println(sb);
    }
}