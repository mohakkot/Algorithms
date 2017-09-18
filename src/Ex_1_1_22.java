import edu.princeton.cs.algs4.*;
import java.util.Arrays;
import java.util.Scanner;
public class Ex_1_1_22 {
	public static int rank(int val, int[] w){
		
		return rank(val, w, 0, w.length-1,0);
		
	}
	public static int rank(int val, int[] w, int lo, int hi, int depth){
		for(int i=0;i<depth;i++)
			StdOut.printf(" ");
		StdOut.printf("Lo = %d, hi= %d\n", lo,hi);
		if (lo>hi) return -1;
		int mid = lo+(hi-lo)/2;
		if (val<w[mid]) return rank(val, w, lo, mid-1, depth+1);
		else if (val > w[mid]) return rank(val, w, mid+1, hi, depth+1);
		else return w[mid];
	}
	
	public static void main(String[] args){
		
		int [] whitelist = {1,2,3,4,5,6,43,12,425,564,23,43,75,90};
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(rank(key, whitelist) == -1)
				StdOut.println(key);
		}
	}
}
