import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_2606 {
	
	static BufferedReader br;
	static StringTokenizer st;
	static boolean[] visit;
	static int[][] computer;
	static Queue<Integer> queue;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int x, y, count = 0;
		
		visit = new boolean[num];
		computer = new int[num][num];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken()) - 1;
			y = Integer.parseInt(st.nextToken()) - 1;
			computer[x][y] = computer[y][x] = 1;
		}
	
		queue = new LinkedList<>();
		visit[0] = true;
		queue.offer(0);
		
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			for(int i=0; i<num; i++) {
				if(computer[cur][i]==1 && !visit[i]) {
					queue.offer(i);
					visit[i] = true;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
