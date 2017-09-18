import edu.princeton.cs.algs4.*;
public class Ex_1_1_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(!StdIn.isEmpty()){
			String name = StdIn.readString();
			int n1 = StdIn.readInt();
			int n2 = StdIn.readInt();
			StdOut.printf("%s %d %d %.3f",name,n1,n2, (double)n1/(double)n2);
		}
	}

}
