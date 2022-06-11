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

		
	    public static void main(String args[]) throws IOException, InterruptedException {
	    	 LinkedList<Integer> list = new LinkedList<Integer>();
	    	LinkedList<Integer> list2 = new LinkedList<Integer>(); //Thread.sleep(5000);
	while(sc.ready()) {
	int n = sc.nextInt();
	int a = sc.nextInt();
	int total=0; boolean f = true; int max2=0;
	int [] b = new int[a];
	for(int i=0;i<a;i++) {
		b[i] = sc.nextInt();
		total+=b[i];
		if(b[i]==n) {f=false;
		max2=b[i];}
	}
	if(total<n) {f =false;}
	int max =0;
	if(f) {
	for(int i=1;i<(1<<a);i++) {
		int sum=0;
		for(int j=0;j<a;j++) {
			if(((i&(1<<j))!=0)) {
				sum+=b[j];
				list.add(b[j]);
			}

		}
		if(sum<=n&& sum >=max) {
		                       max = sum;
		                    	    list2 = (LinkedList<Integer>) list.clone();
		                       }   
		list = new LinkedList<Integer>();
		                       
		}
		
	
	while(list2.size()>0) { pWriter.print(list2.pollFirst()+ " ");
	}
	
	pWriter.println("sum:" +max);
	}
	
	else if(max2==n) pWriter.println(max2 +" sum:"+max2);
	else {
		for(int i=0;i<b.length;i++) pWriter.print(b[i]+ " " );
		pWriter.println("sum:"+total);
	}
	pWriter.flush();
	    
	   }
}
}


