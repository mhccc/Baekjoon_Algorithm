import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon_10845 {
	
	private int cmdCase;
	private int[] queue;
	private int head = 0;
	private int tail = 0;
	
	public static void main(String[] args) throws IOException {
		try {
			new Baekjoon_10845().run();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		cmdCase = Integer.parseInt(br.readLine());
		queue = new int[cmdCase];
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String cmd = null;
		int x = 0;
		
		for(int i=0; i<cmdCase; i++) {
			st = new StringTokenizer(br.readLine());
			cmd = st.nextToken();
			
			switch(cmd) {
			case "push":
				x = Integer.parseInt(st.nextToken());
				push(x); break;
			case "pop":
				sb.append(pop() + "\n"); break;
			case "size":
				sb.append(size() + "\n"); break;
			case "empty":
				sb.append(empty() + "\n"); break;
			case "front":
				sb.append(front() + "\n"); break;
			case "back":
				sb.append(back() + "\n"); break;
			}
		}
		
		System.out.print(sb);
	}
	
	public void push(int x) {
		queue[tail++] = x;
	}
	
	public int pop() {
		int result = -1;
		if(empty() != 1) result = queue[head++]; 
		return result;
	}
	
	public int size() {
		return tail - head;
	}
	
	public int empty() {
		int result = 0;
		if(head == tail) result = 1;
		return result;
	}
	
	public int front() {
		int result = queue[head];
		if(empty() == 1) result = -1; 
		return result;
	}
	
	public int back() {
		int result = -1;
		if(empty() != 1) result = queue[tail-1]; 
		return result;
	}
}
