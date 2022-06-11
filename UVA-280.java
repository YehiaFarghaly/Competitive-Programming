 import java.util.*;
import java.io.*;
public class Main{
	static int n;
	static int [] dis;
	static boolean vis1[],vis2[];
	static int c2;
	static Queue<Integer> queue;
	static ArrayList<Integer>[] adjLists;
	public static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		vis1 = new boolean[n];
		dis = new int[n];
		queue.add(node);
		while(!queue.isEmpty()) {
			int curr=queue.poll();
			for(int i:adjLists[curr]) {
				if(!vis1[i-1]) {
					vis1[i-1]=true;
					dis[i-1]=dis[curr]+1;
					queue.add(i-1);
				}
			}
		}
		
		
		
	}
	public static void main(String args[]) throws IOException,InterruptedException {
		n=sc.nextInt();
		while(n!=0) {
			String s = sc.nextLine();
			adjLists=new ArrayList[n];
			for(int i=0;i<n;i++) adjLists[i] = new ArrayList<Integer>();
			while(s.charAt(0)!='0') {
				String []a = s.split(" ");
				int x = Integer.parseInt(a[0]);
				for(int i=1;i<a.length-1;i++) {
					adjLists[x-1].add(Integer.parseInt(a[i]));
				}
				s=sc.nextLine();
			}
			String a[] = sc.nextLine().split(" ");
			for(int i=1;i<a.length;i++) {
				StringBuilder out = new StringBuilder(),temp = new StringBuilder();
				int ctr=0;
				int num = Integer.parseInt(a[i]);
				bfs(num-1);
				for(int j=0;j<n;j++) {
					if(dis[j]<1) {
						ctr++;
						temp.append(j+1+" ");
					}
				}
				out.append(ctr+" ");
				out.append(temp.toString());
				pWriter.println(out.toString().trim());
			}
			n=sc.nextInt();
			
		}
		pWriter.flush();
		
		
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

	






	    
	
