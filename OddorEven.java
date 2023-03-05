//odd or even in java program?
import java.util.*;
public class OddorEven {
public static void main(String atgs[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	if(n%2==0){
		System.out.println("Entered number is even");
	}
	else
		System.out.println("Enter Number is odd");
}
}
