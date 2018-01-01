import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Baekjoon_1260 {
	
	static int nodeCnt;
	static int edgeCnt;
	static int init;
	
	static int[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		nodeCnt = Integer.parseInt(st.nextToken());
		edgeCnt = Integer.parseInt(st.nextToken());
		init = Integer.parseInt(st.nextToken());
		graph = new int[nodeCnt+1][nodeCnt+1];
		visited = new boolean[nodeCnt+1];
		
		String[] str;
		for(int i=0; i<edgeCnt; i++) {
			str = br.readLine().split(" ");
			graph[Integer.parseInt(str[0])][Integer.parseInt(str[1])]
					= graph[Integer.parseInt(str[1])][Integer.parseInt(str[0])] = 1;
		}
		
		dfs(init);
		for(int i=1; i<=nodeCnt; i++) {
			visited[i] = false;
		}
		System.out.println();
		bfs(init);
	}

	private static void dfs(int init) {
		visited[init] = true;
		System.out.print(init + " ");
		
		for(int i=1; i<=nodeCnt; i++) {
			if (graph[init][i] == 1 && visited[i] != true) {
				dfs(i);
			}
		}
	}
	
	private static void bfs(int init) {
		visited = new boolean[nodeCnt+1];
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int node;

		q.offer(init);
		visited[init] = true;
		
		while(!q.isEmpty()) {
			node = q.poll();
			sb.append(node + " ");
			
			for(int i=1; i<=nodeCnt; i++) {
				if (graph[node][i] == 1 && visited[i] != true) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}