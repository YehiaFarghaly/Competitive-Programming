import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException,InterruptedException {
		 int n = sc.nextInt(); 
		 int a[] = sc.nextIntArray(n);
		 int q = sc.nextInt();
		 int b[] = sc.nextIntArray(q);		 
for(int i=0;i<q;i++) {
		 int start =0;
		 int end = n-1;
		 int mid =(start+end)/2;
		 boolean found = true;
		 while(start<=end) {
			 if(a[mid]>b[i]) {
				 end = mid-1;
			 }
				 else {
					start = mid+1;
				}
			 mid = (start+end)/2;
		 }
		 if(end<0||a[end]!=b[i]) found = false;
		 if (a.length==1 && a[0]==b[i]) {
			 pWriter.println("X X");
			
		}
		 else if(b[i] <= a[0]) { int j =0;
		 while(a[j]==b[i])j++; 
			 pWriter.println("X " + a[j]); 
			 }
			else if(b[i]>=a[n-1]) {
				int j =1; 
				while(a[n-j]==b[i]) j++;
				pWriter.println(a[n-j] + " X");
			}
			else {
				if(!found)
				pWriter.println(a[end] + " " +a[start]);
				else { int j =1; 
				while(a[end-j]==b[i]) j++;
				
					pWriter.println(a[end-j] + " " +a[start]);
				
				}
			}
		 pWriter.flush();
		 
}
	}
	
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pWriter = new PrintWriter(System.out);
	
	
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
}
