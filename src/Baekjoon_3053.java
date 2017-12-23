import java.util.Scanner;

public class Baekjoon_3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.printf("%.6f\n", r*r*Math.PI);
		System.out.printf("%.6f", (double) r*r*2);
		sc.close();
	}
}
