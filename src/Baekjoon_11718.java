import java.io.*;

public class Baekjoon_11718 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = new String[101];
        String str = null;
        
        for(int i=0; (str=br.readLine())!=null; i++) {
            arr[i] = str;
        }
        
        int i = 0;
        while(arr[i]!=null) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
