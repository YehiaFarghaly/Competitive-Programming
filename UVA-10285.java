import java.util.*;
import java.io.*;
public class Main{
static int maxn=105;
static int vis[][];
static int memo[][];
static String name;
static int r,c;
static boolean valid1(int x) {
	if(x-1>=0) return true;
	return false;
}
static boolean valid2(int x, int y) {
	if((x+1)<y) return true;
	return false;
}
public static int dp(int i , int j) {
if(memo[i][j]!=-1) return memo[i][j];
int ctr=1;
if(i-1>=0&& vis[i][j]>vis[i-1][j]) ctr=Math.max(ctr, 1+ dp(i-1, j));
if(i+1<=r && vis[i][j]>vis[i+1][j]) ctr=Math.max(ctr,1+dp(i+1, j));
if(j-1>=0 && vis[i][j]>vis[i][j-1]) ctr=Math.max(ctr,1+dp(i, j-1));
if(j+1<=c&&vis[i][j]>vis[i][j+1]) ctr =Math.max(ctr,1+dp(i, j+1));
return memo[i][j]=ctr;
}
public static void main(String args[]) throws IOException,InterruptedException {  
int n = sc.nextInt();
while(n-->0) {
	vis = new int[maxn][maxn];
	memo = new int[maxn][maxn];
	for(int x[]:memo) Arrays.fill(x, -1);
	name = sc.next();  r = sc.nextInt(); c=sc.nextInt();
	for(int i=0;i<r;i++)
		for(int j=0;j<c;j++) vis[i][j]=sc.nextInt();
	int max = 0;
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			max = Math.max(max, dp(i, j));
		}
	}
	pWriter.println(name+": "+max);
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
