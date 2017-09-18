import edu.princeton.cs.algs4.*;
public class Ex_1_1_09 {
	public static void main(String[] args) {
		int N = StdIn.readInt();
		String s ="";
		while(N>0){
			s = (N%2) + s;
			N=N/2;
		}
		StdOut.println(s);
	}
}
