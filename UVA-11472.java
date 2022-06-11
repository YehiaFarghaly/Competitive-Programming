import java.util.*;
import java.io.*;
public class Main{
static Long memo[][][];
static int n,m;
static int mod = (int)1e9+7;
public static long dp(int idx, int mask, int x) {
	if(idx>m) return 0;
	if(memo[idx][mask][x]!=null) return memo[idx][mask][x];
	long ret=0;
	if(x==n-1) ret+=dp(idx+1, mask|1<<(x-1), x-1);
	else if(x==0) ret+=dp(idx+1, mask|1<<(x+1), x+1);
	else {
		ret+=dp(idx+1,mask| 1<<(x+1), x+1);
		ret+=dp(idx+1, mask|1<<(x-1), x-1);
	}
	if(mask==((1<<n)-1)) ret++;
	ret%=mod;
	return memo[idx][mask][x]=ret;
	
	
}
public static void main(String args[]) throws IOException,InterruptedException {  
int t = sc.nextInt();
while(t-->0) {
	n = sc.nextInt(); m = sc.nextInt();
	memo = new Long[m+2][(1<<n)+2][n+2];
	long ans=0;
	for(int i=1;i<n;i++) {
		ans+=dp(1, 1<<i, i);
		ans%=mod;
	}
	pWriter.println(ans);
	
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
