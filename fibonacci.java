package week1.day1;

public class fibonacci {
public static void main(String[] args) {
	int r=8; 
			int num1=0; 
	int num2 = 1; 
			int sum=0;
			System.out.println(num1);
			for(num1=0; num1<=r; num1++) {
				num1=num2;
				num2=sum;
				sum= num1+num2;
				System.out.println(sum);
			}
	
}
}
