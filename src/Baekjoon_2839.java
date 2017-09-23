import java.io.*;

public class Baekjoon_2839 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            
            if(N%5 == 4) {
                if(N/5 >= 1) {
                    System.out.println((N/5) + 2);
                } else {
                    System.out.println(-1);
                }
            } else if(N%5 == 3) {
                System.out.println((N/5) + 1);
            } else if(N%5 == 2) {
                if(N/5 >= 2) {
                    System.out.println((N/5) + 2);
                } else {
                    System.out.println(-1);
                }
            } else if(N%5 == 1) {
                if(N/5 >= 1) {
                    System.out.println((N/5) + 1);
                } else {
                    System.out.println(-1);
                }
            } else {
                System.out.println(N/5);
            }
        } catch(IOException e) {
            
        }
    }
}
