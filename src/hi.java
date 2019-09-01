import java.util.Arrays;
import java.util.Stack;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class hi {
	public static void main(String[] args) {
		Stack<Integer>nums = new Stack<Integer>();
		Stream<Integer>s = nums.stream();
		double[]list = new double[1000];
		//double a = Arrays.stream(list); a = a.sorted();
		double[]list2 = 
				{2,4};


		DoubleStream dubStream = Arrays.stream(list2); 
		dubStream = dubStream.sorted();
		dubStream.forEach((d)->Math.sqrt(d));
	}
}
