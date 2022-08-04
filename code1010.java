package test;

import java.util.Scanner;

public class code1010 {
	static int[][] dp = new int [30][30];
	
	static int comb(int m,int n) {
		if(dp[m][n]>0) return dp[m][n];
		if(n==0||m==n) return dp[m][n]=1;
		else return dp[m][n]=comb(m-1,n-1)+comb(m-1,n);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int T=scan.nextInt();
		
		for(int i=0;i<T;i++) {
			int N=scan.nextInt();
			int M=scan.nextInt();
			sb.append(comb(M,N)).append('\n');
		}
		System.out.println(sb);
	}
}