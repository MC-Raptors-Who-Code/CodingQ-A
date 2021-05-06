import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZeroes {
	
	public static void main(String[] args) {
		int[] arr1 = {0,1,0,3,12};
		int[] arr2 = {10,5,0,0,7,13,0};
		printArr(moveZeroes(arr1)); //Prints 1,3,12,0,0
		printArr(moveZeroes(arr2)); //Prints 10,5,7,13,0,0,0
	}
	
	public static void printArr(int[] arr) {
		String s = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(","));
		System.out.println(s);
	}
	
	public static int[] moveZeroes(int[] arr) {
		return Arrays.stream(arr).boxed().sorted((a,b) -> {
			return a == 0 ? 1 : b == 0 ? -1 : 0;
		}).mapToInt(e -> e).toArray();
	}
	
}
