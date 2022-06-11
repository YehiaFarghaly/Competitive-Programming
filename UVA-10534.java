import java.util.*;
import java.io.*;
public class Main{
static int y;
public static int[] LIS(int [] arr) {
	int n = arr.length;
	int [] ser = new int[n];
	int[] lis = new int[n];
	Arrays.fill(ser, Integer.MAX_VALUE);
	for(int i=0;i<n;i++) {
		int low = 0;
		int high=n-1;
		int mid = (low+high)/2;
		while(low<=high) {
			if(ser[mid]<arr[i]) low = mid+1;
			else high = mid-1;
			mid = (low+high)/2;
		}
		lis[i] = high+2;
		ser[high+1] = Math.min(ser[high+1], arr[i]);
	}
	return lis;
}
public static int[] LDS(int arr[]) {
	int n = arr.length;
int [] ser = new int[n];
int[] lis = new int[n];
Arrays.fill(ser, Integer.MAX_VALUE);
for(int i=0;i<n;i++) {
	int low = 0;
	int high=n-1;
	int mid = (low+high)/2;
	while(low<=high) {
		if(ser[mid]<arr[i]) low = mid+1;
		else high = mid-1;
		mid = (low+high)/2;
	}
	lis[i] = high+2;
	ser[high+1] = Math.min(ser[high+1], arr[i]);
}
return reverse(lis);
}
public static int[] reverse(int a[]) {
	int b[] = new int[a.length];
	for(int i=0;i<a.length;i++) {
		b[i]=a[a.length-1-i];
	}
	return b;
}
	public static void main(String args[]) throws IOException,InterruptedException {  //Thread.sleep(5000);
	while(sc.ready()) {
		int n = sc.nextInt();
		 int[]a = sc.nextIntArray(n);
		int lis[] = LIS(a);
		int lds[] = LDS(reverse(a));
		int ans=0;
		for(int i=0;i<n;i++) {
			ans=Math.max(ans, Math.min(lis[i], lds[i])*2-1);
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
