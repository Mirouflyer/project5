package operator;

public class UseOperator {

	public static void main(String[] args) {
		int num1=300;
		int num2=200;
		if ((num1>num2)&&(num1%2==0)) {
			System.out.println(num1+" is bigger than the "+num2+" "+num1+" is an even number");
		}else if (num1<num2){
			System.out.println(num2+"is bigger than the "+num1);
		}else if (num1==num2) {
            System.out.println(num1+"is equal to "+num2);
	}
	}
}
