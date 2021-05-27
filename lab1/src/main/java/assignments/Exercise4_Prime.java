package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_Prime {

	public static void main(String[] args) throws IOException {
		int count = 0;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		String s =br.readLine();
		int n = Integer.parseInt(s);
		
		for(int i = 2;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				if(i%j == 0) 
					count++;
			}
				if(count==2)
				System.out.println(""+i);
				count=0;
				}
			}
		}
	

