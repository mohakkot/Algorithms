import edu.princeton.cs.algs4.*;

public class Ex_1_1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = StdIn.readInt();
		StdOut.println(lg(N));
		
	}
	public static int lg (int n){
		if(n <= 0) throw new IllegalArgumentException();
	    return 31 - Integer.numberOfLeadingZeros(n);
	}	
	
}
