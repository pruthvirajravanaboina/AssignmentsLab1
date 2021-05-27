package assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args)throws Exception{
		int rem;
		int add;
		int sum=0;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		String s =br.readLine();
		int n = Integer.parseInt(s);
		
		while(n>0) {
			rem = n%10;
			add = (rem*rem*rem);
			sum = sum + add;
			n = (n/10);			
		}
		System.out.println("Sum of the cubes of number is "+sum);
	}

}
