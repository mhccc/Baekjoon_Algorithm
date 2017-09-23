public class Baekjoon_4673 {
	public static void main(String[] args) {
		int[] arr = new int[10001];
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=10000; i++) {
			arr[d(i)] = 1;
		}
		
		for(int i=1; i<=10000; i++) {
			if(arr[i] == 0)
				sb.append(i + "\n");
		}
		
		System.out.print(sb);
	}
	
	static int d(int n) {
		n = n + (n/10000) + (n%10000/1000) + (n%1000/100) + (n%100/10) + (n%10);
		
		if(n<=10000)
			return n;
		else
			return 0;
	}
}
