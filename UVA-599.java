 import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[])throws IOException,InterruptedException {
int n = sc.nextInt(); 
while(n-->0) { int ctr1=0; int ctr2=0;
list = new ArrayList[26];
vis = new boolean[26];
	String a = sc.next();
	for(int i=0;i<26;i++) list[i] = new ArrayList<>();
	while(a.charAt(0)!='*') {
		list[a.charAt(1)-'A'].add(a.charAt(3)+"");
		list[a.charAt(3)-'A'].add(a.charAt(1)+"");
		a=sc.next();
	}
	String [] strArr = sc.next().split(",");
	for(int i=0;i<strArr.length;i++) { int x= dfs(strArr[i].charAt(0)-'A');
		if(x>1) ctr1++;
		else if(x==1) ctr2++;
	}
	pWriter.println("There are "+ctr1+" tree(s) and "+ctr2+" acorn(s).");
}

pWriter.flush();
	}
	static boolean vis[];
	static ArrayList<String> list [];
	static int dfs(int n) { int ctr;
		if(!vis[n])ctr=1;
		else ctr=0;
		vis[n]=true;
		for(String i:list[n]) {
			if(!vis[i.charAt(0)-'A']) ctr+=dfs(i.charAt(0)-'A');
		}
		return ctr;
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

	






	    
	
