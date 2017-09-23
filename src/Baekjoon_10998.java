import java.io.*;
import java.util.*;

public class Baekjoon_10998 {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
           
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
        
            System.out.println(a*b);
        } catch(Exception e) {
            
        }
    }
}
