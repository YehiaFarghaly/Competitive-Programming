import java.util.*;
import java.io.*;
public class Main{
//static int h,w;
//static String path[];
//static long dp[][];
static long m = 1000000007;
//static long solve(int idx,int ch) {
//	if(idx==0&&ch==0) return 1;
//	if(path[idx].charAt(ch)=='*') return 0;
//	if(idx==0) return dp[idx][ch]=solve(idx, ch-1);
//	if(ch==0) return dp[idx][ch] = solve(idx-1, ch); 
//	if(dp[idx][ch]!=0) return dp[idx][ch];
//	return dp[idx][ch] = solve(idx-1, ch) + solve(idx, ch-1);
//}
	
	
	public static void main(String args[]) throws IOException,InterruptedException { 
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),b=sc.nextInt();
			long a[][] = new long[n][n];
			for(long[]x:a) Arrays.fill(x, 1);
			while(b-->0) {
				int r1=sc.nextInt()-1,c1=sc.nextInt()-1,r2=sc.nextInt()-1,c2=sc.nextInt()-1;
				for(int i=r1;i<=r2;++i) 
					Arrays.fill(a[i], c1, c2+1, Integer.MIN_VALUE);
				
			}
			 for(int i =0 ; i < n ; i ++)
	                for(int j =0 ; j < n ; j++)
	                {
	                    if(i>0)a[i][j]+=a[i-1][j];
	                    if(j>0)a[i][j]+=a[i][j-1];
	                    if(i>0 && j >0)a[i][j]-=a[i-1][j-1];
	                }
			 long maxSubRect = Integer.MIN_VALUE;
	            for(int i =0 ; i < n ;i ++)
	                for(int j =0 ; j < n ;j ++)
	                    for(int k =i ; k < n ; k++)
	                        for(int l = j ;l <n ; l++)
	                        {
	                            long sub = a[k][l];
	                            if(i>0)sub-=a[i-1][l];
	                            if(j>0)sub-=a[k][j-1];
	                            if(i>0 && j>0)sub+=a[i-1][j-1];
	                            maxSubRect= Math.max(sub, maxSubRect);
	                        }
	            pWriter.println(Math.max(maxSubRect , 0));
	        }
		pWriter.flush();	
		
	
}

	static class Pair{
		int a;
		int b;
		public Pair(int a,int b) {
			this.a=a;
			this.b=b;
		}
	}


	 static Scanner sc = new Scanner(System.in); 
	 static   PrintWriter pWriter= new PrintWriter(System.out);
		static class Scanner {
			StringTokenizer st;
			BufferedReader br;
	 
			public Scanner(InputStream s) {
				br = new BufferedReader(new InputStreamReader(s));
			}
	 
			public Scanner(FileReader r) {
				br = new BufferedReader(r);
			}
	 
			public String next() throws IOException {
				while (st == null || !st.hasMoreTokens())
					st = new StringTokenizer(br.readLine());
				return st.nextToken();
			}
	 
			public int nextInt() throws IOException {
				return Integer.parseInt(next());
			}
	 
			public long nextLong() throws IOException {
				return Long.parseLong(next());
			}
	 
			public String nextLine() throws IOException {
				return br.readLine();
			}
	 
			public double nextDouble() throws IOException {
				String x = next();
				StringBuilder sb = new StringBuilder("0");
				double res = 0, f = 1;
				boolean dec = false, neg = false;
				int start = 0;
				if (x.charAt(0) == '-') {
					neg = true;
					start++;
				}
				for (int i = start; i < x.length(); i++)
					if (x.charAt(i) == '.') {
						res = Long.parseLong(sb.toString());
						sb = new StringBuilder("0");
						dec = true;
					} else {
						sb.append(x.charAt(i));
						if (dec)
							f *= 10;
					}
				res += Long.parseLong(sb.toString()) / f;
				return res * (neg ? -1 : 1);
			}
	 
			public long[] nextlongArray(int n) throws IOException {
				long[] a = new long[n];
				for (int i = 0; i < n; i++)
					a[i] = nextLong();
				return a;
			}
	 
			public Long[] nextLongArray(int n) throws IOException {
				Long[] a = new Long[n];
				for (int i = 0; i < n; i++)
					a[i] = nextLong();
				return a;
			}
	 
			public int[] nextIntArray(int n) throws IOException {
				int[] a = new int[n];
				for (int i = 0; i < n; i++)
					a[i] = nextInt();
				return a;
			}
	 
			public Integer[] nextIntegerArray(int n) throws IOException {
				Integer[] a = new Integer[n];
				for (int i = 0; i < n; i++)
					a[i] = nextInt();
				return a;
			}
	 
			public boolean ready() throws IOException {
				return br.ready();
			}
	 
		}
		public static void display(char[][]a) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
				
				
		}
		}
}

	






	    
