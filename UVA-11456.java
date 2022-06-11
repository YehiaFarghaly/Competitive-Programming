import java.util.*;
import java.io.*;
public class Main{

	public static void main(String args[]) throws IOException,InterruptedException { 
              int t = sc.nextInt();
              while(t-->0) {
            	 int n=sc.nextInt();
            	int  []a = sc.nextIntArray(n);
            	int []lis=new int[n]; int lds[] = new int[n]; int ans=0;
            	for(int i=n-1;i>=0;i--) {
            		lis[i]=1; lds[i]=1;
            		for(int j=i+1;j<n;j++) {
            			if(a[i]<a[j]) {
            				lis[i] = Math.max(lis[j]+1, lis[i]);
            			}
            			if(a[i]>a[j]) {
            				lds[i]=Math.max(lds[j]+1, lds[i]);
            			}
            		}
            		ans = Math.max(ans,lis[i]+lds[i]-1);
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
