import edu.princeton.cs.algs4.*;
public class Ex_1_1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = StdIn.readInt();
		int m = StdIn.readInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) 
			a[i] = StdRandom.uniform(m);
		for(int i =0; i<n;i++) 
			 StdOut.print(a[i]+" ");
		StdOut.println();
		a = Histogram(a, m);
		for(int i =0; i<m; i++) 
			 StdOut.print(a[i] + " ");
	}
	public static int[] Histogram(int[] a, int m){
		int[] h = new int[m];
		for(int i =0; i<a.length;i++){
			if(a[i] <m)
				h[a[i]]++;
		}
		return h;
	}
}
