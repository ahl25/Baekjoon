package test;

import java.util.*;

public class code1022 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r1=scan.nextInt();
		int c1=scan.nextInt();
		int r2=scan.nextInt();
		int c2=scan.nextInt();
		
		int map[][]=new int[r2-r1+1][c2-c1+1];
		int dx[]= {0,-1,0,1};
		int dy[]= {1,0,-1,0};
		int x=0,y=0,num=1,dir=0,len=1,cnt=0;
		int max=0;
		
		while(true) {
			if(map[0][0]!=0&&map[r2-r1][0]!=0&&map[0][c2-c1]!=0&&map[r2-r1][c2-c1]!=0) break;
			if(x>=r1&&x<=r2&&y>=c1&&y<=c2) map[x-r1][y-c1]=num;
			num++;
			cnt++;
			x+=dx[dir];
			y+=dy[dir];
			if(cnt==len) {
				cnt=0;
				if(dir==1||dir==3) len++;
				dir=(dir+1)%4;
			}
		}
		max=num-1;
		int maxLen=(int)Math.log10(max);
		for(int i=0;i<=r2-r1;i++) {
			for(int j=0;j<=c2-c1;j++) {
				int mlen=maxLen-(int)Math.log10(map[i][j]);
				for(int k=0;k<mlen;k++) {
					System.out.print(" ");
					}
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
