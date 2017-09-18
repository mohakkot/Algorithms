import edu.princeton.cs.algs4.*;
import java.lang.Math;
public class Ex_1_1_20 {

	public static double lFact(int N){
		if(N==1) return 0.0;
		else return Math.log(N) + lFact(N-1);	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<10;i++){
			StdOut.println(i + " " + lFact(i));
		}
	}

}
