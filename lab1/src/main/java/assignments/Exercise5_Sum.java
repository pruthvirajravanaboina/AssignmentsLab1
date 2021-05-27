package assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise5_Sum {

	public static void main(String[] args)throws Exception{
		int n ;
		int i ;
		int sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		String s = br.readLine();
		n = Integer.parseInt(s);
		
		for(i=0;i<=n;i++) {
			if (i%3==0 || i%5==0)
				sum += i;			
			}
		System.out.println("The Sum is: "+sum);
	}

}
