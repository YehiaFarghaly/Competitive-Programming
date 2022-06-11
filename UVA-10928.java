import java.util.*;
import java.io.*;
public class Main{
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
 
		
public static void main(String args[])throws IOException,InterruptedException {
int n = sc.nextInt();
while(n-->0) {
	int p = sc.nextInt(); int ctr = 0; 
	int min=Integer.MAX_VALUE; int minctr=0; 
	String b [] = new String[p]; int minLength = Integer.MAX_VALUE;
	String string ="";
	for(int i=0;i<p;i++) {
		b[i] = sc.nextLine();
		if(b[i].length()<minLength) { minLength=b[i].length(); min =i+1;
		string=b[i];}
	}
	String minVal=min+" ";
	for(int i=0;i<string.length();i++) {
		if(string.charAt(i)==' ')  minctr++;
	}
	for(int i=0;i<p;i++) {ctr=0;
		for(int j=0;j<b[i].length();j++) {
			if(b[i].charAt(j)==' ') ctr++;
		}
		if(ctr==minctr && i!=min-1) {
			minVal=minVal+(i+1)+" "; 
		}
	}
	PriorityQueue<Integer>pQueue = new PriorityQueue<>();
	int space=0;
	for(int i=0;i<minVal.length();i++) {
		if(minVal.charAt(i)==' ') {
			pQueue.add(Integer.parseInt(minVal.substring(space, i)));
			space=i+1;
		}
	}
	while(pQueue.size()>0) {
		if(pQueue.size()>1)
		pWriter.print(pQueue.poll()+" ");
		else pWriter.print(pQueue.poll());
	}

	    pWriter.println();
	   }
pWriter.flush();
}
static boolean[] vis;
static ArrayList<Integer>[] list;
static void dfs(int n) {
	vis[n]=true;
	for(int i:list[n]) {
		if(!vis[i]) dfs(i);
	}
}
}
