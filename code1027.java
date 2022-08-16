package test;

import java.util.*;

public class code1027 {
	static int N;
	static public void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		N=scan.nextInt();
		long[] map=new long[N];
		for (int i=0;i<N;i++) {
			map[i]=scan.nextLong();
		}
		int result=maxbuilding(map);
		System.out.println(result);
	}
	public static int maxbuilding(long[] map) {
		int max=0;
		for(int i=0;i<N;i++) {
			double temp=0;
			int maxview=0;
			for(int j=i-1;j>=0;j--) {
				double slope=(map[i]-map[j])/(double)(i-j);
				System.out.println(slope);
				if(j==i-1) {
					maxview++;
					temp=slope;
				}
				if(temp>slope) {
					maxview++;
					temp=slope;
				}
			}
			temp=0;
			for(int k=i+1;k<N;k++) {
				double slope=(map[k]-map[i])/(k-i);
				if(k==i+1) {
					maxview++;
					temp=slope;
				}
				if(temp<slope) {
					maxview++;
					temp=slope;
				}
			}
			if(max<maxview) max=maxview;
		}
		return max;
	}
}
