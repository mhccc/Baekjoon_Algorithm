import java.io.*;

public class Baekjoon_1008 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String[] x = br.readLine().split(" ");
            System.out.println(Integer.parseInt(x[0])/(double) (Integer.parseInt(x[1])));
        } catch(IOException e) {
            
        }
    }
}
