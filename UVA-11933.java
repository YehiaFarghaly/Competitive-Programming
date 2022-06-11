import java.io.PrintWriter;
import java.util.Scanner;
public class Main{
	public static void main(String[] argS) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pWriter = new PrintWriter(System.out);
int n=scanner.nextInt();
while(n!=0) {
	char [] ch = Integer.toBinaryString(n).toCharArray();
	String a = "", b ="";
	boolean f = true;
	for(int i =0;i<ch.length;i++) {
		char c=ch[ch.length-i-1];
		if (c=='0') {
			a=0+a;
			b=0+b;
		}
		else {
			if (f) {
				a=1+a;
				b=0+b;
			}
			else {
				a=0+a;
				b=1+b;
			}
			f=!f;
		}
		
	}
	pWriter.println(Integer.parseInt(a, 2) + " " + Integer.parseInt(b, 2));
	n =scanner.nextInt();
}


pWriter.flush();
	}

}
