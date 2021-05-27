package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_Fibbo {

	public static void main(String[] args) throws IOException {
		int a = 0;
		int b = 1;
		int c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		String s = br.readLine();
		int n = Integer.parseInt(s);
		System.out.println("Fibbonaci sequence is: ");
		for (int i = 0; i <= n; i++) {
			c = a + b;
			System.out.println(" "+a);
			a = b ;
			b = c;
			
			
		}
	}

}
