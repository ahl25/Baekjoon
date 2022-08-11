package test;

import java.util.*;

public class code1038 {
	static ArrayList<Long> arr=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n>1022) System.out.println(-1);
		else {
			for (int i=0;i<10;i++) decrease(i,1);
			Collections.sort(arr);
			System.out.println(arr.get(n));
		}
	}
	public static void decrease(long num,int dec) {
		if(dec>10) return;
		arr.add(num);
		for(int i=0;i<num%10;i++) {
			decrease((num*10)+i,dec+1);
		}
	}
}
