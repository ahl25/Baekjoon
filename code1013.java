package test;

import java.util.*;

public class code1013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			String str=scan.next();
			String ptn="(100+1+|01)+";
			System.out.println(str.matches(ptn)?"YES":"NO");
		}
	}
}
