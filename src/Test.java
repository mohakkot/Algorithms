import java.lang.Math;
import edu.princeton.cs.algs4.*;
/**
 * @author Mohak
 *
 */
public class Test {
 public static void main(String args[]){
	 System.out.println(mystery(2,25));
 }
 public static int mystery(int a, int b)
 {
 if (b == 0) return 1;
 if (b % 2 == 0) return mystery(a+a, b/2);
 return mystery(a+a, b/2) * a;
 }
}
