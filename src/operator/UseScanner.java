package operator;
import java.util.Scanner;
public class UseScanner {

	public static void main(String[] args) {
		Scanner enter= new Scanner(System.in);
		System.out.println("Please enter two numers: ");
		int num1 = enter.nextInt();
		int num2 = enter.nextInt();
		if(num1>num2 && num1%2==0) {
			System.out.println(num1+" is bigger than "+num2);
			System.out.println(num1+" is an even");
		}else if (num1<num2) {
			System.out.println(num2+" is bigger than the"+num1);
		}else if (num1==num2) {
		System.out.println(num1+" is equal to "+num2);
        enter.close();
	}
	}
}
