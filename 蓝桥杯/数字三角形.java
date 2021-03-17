

import java.util.Scanner;



public class class08 {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
      int f[][] = new int[110][110];
      for(int i =1;i<=n;i++) {
    	  for(int j = 1;j<=i;j++) {
    		  f[i][j] = in.nextInt();
    	  }
      }
      int dp[][] = new int[110][110];

      int l = 0,r = 0;
    for(int i = 1 ;i <=n;i++) {
    	for(int j = 1;j<=i;j++) {
    		if(j==1)
    			dp[i][j] = dp[i-1][j]+f[i][j];
    		else {
				dp[i][j] = Math.max(dp[i-1][j], dp[i -1][j -1])+f[i][j];
			}
    	}
    }
    if(n % 2== 1) {
    	System.out.println(dp[n][n/2 +1]);
    }else {
    	System.out.println(Math.max(dp[n][n/2],dp[n][n/2+1]));
    }
	}
}


