package input;
import java.util.*;
public class StringInput {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter 10 names of Animals: ");
      String[] animals =new String [10];
      System.out.println("the length of the this Array is : "+animals.length);
      for (int i=0;i<=10;i++ ) {
    	  animals[i]=input.nextLine();
      }
      System.out.println("The animals name's entered were: ");
      for(String j: animals) {
    	  System.out.print(j);
      }
      input.close();
	}

}
