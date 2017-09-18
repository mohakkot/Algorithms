import edu.princeton.cs.algs4.*;
public class Ex_1_1_11 {
	public static void main(String[] args) {
		boolean[][] a;
		a = new boolean[1][2];
		for(int i=0; i<1;i++){
			for (int j=0; j<2;j++){
				a[i][j] = StdIn.readBoolean();
			}
		}
		for(int i=0; i<1;i++){
			for (int j=0; j<2;j++)
			if (a[i][j] == true)
				StdOut.println(i + "," +j + "*");
			else
				StdOut.println(i + "," +j + " ");
		}
	}
}
