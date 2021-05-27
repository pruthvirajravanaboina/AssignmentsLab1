package assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise2_Traffic {

	public static void main(String[] args)throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Colour:");
		System.out.println("1.Green");
		System.out.println("2.Yellow");
		System.out.println("3.Red");
		String s =br.readLine();
		int n = Integer.parseInt(s);
		
		switch (n) {
		case 1 : 
			System.out.println("Let's Go...");
			break;
		case 2 :
			System.out.println("Get ready");
			break;
		case 3:
			System.out.println("Please Stop!!!");
			break;
		default:
			System.out.println("Select buttons available");
		}
			
	}

}
