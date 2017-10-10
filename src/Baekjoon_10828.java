import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baekjoon_10828 {
	int[] stack = new int[10000];
	int top = -1;
	
	public static void main(String[] args) {
		try {
			new Baekjoon_10828().run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cn = Integer.parseInt(br.readLine());
		String[] cmd;
		for(int i=0; i<cn; i++) {
			cmd = br.readLine().split(" ");
			
			switch(cmd[0]) {
			case "push": 
				push(Integer.parseInt(cmd[1])); break;
			case "pop":
				System.out.println(pop()); break;
			case "size":
				System.out.println(size()); break;
			case "empty":
				System.out.println(empty()); break;
			case "top":
				System.out.println(top()); break;
			}
		}
	}
	
	public void push(int x) {
		stack[++top] = x;
	}
	
	public int pop() {
		int result;
		
		if(empty() == 0) result = stack[top--];
		else result = -1;
		
		return result;
	}
	
	public int size() {
		return top+1;
	}
	
	public int empty() {
		int result;
		
		if(top == -1) result = 1;
		else result = 0;
		
		return result;
	}
	
	public int top() {
		int result;
		
		if(empty() == 0) result = stack[top];
		else result = -1;
		
		return result;
	}
}
