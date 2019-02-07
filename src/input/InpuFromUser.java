package input;
import java.util.Scanner;
public class InpuFromUser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int [10];
		System.out.println("Please enter some numbers");
		for(int i=0;i<10;i++) {
        numbers[i]= input.nextInt();
	}
		for(int j=0;j<10;j++) {
			System.out.println(numbers[j]);
			input.close();
	}
	}
}
