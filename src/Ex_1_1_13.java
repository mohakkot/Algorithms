import edu.princeton.cs.algs4.*;

public class Ex_1_1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = StdIn.readInt();
		int n = StdIn.readInt();
		int [][] a = new int[m][n];
		int [][] at = new int[n][m];
		for(int i =0; i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j] = StdIn.readInt();
			}
		}
		for(int i =0; i<m;i++){
			for(int j=0;j<n;j++){
				at[j][i] = a[i][j];
			}
		}
		for(int i =0; i<n;i++){
			for(int j=0;j<m;j++){
				StdOut.println(i + ", " +j +" " + at[i][j]);
			}
		}
	}
}
