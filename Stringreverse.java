package Stringprograms;

public class Stringreverse {

	public static void main(String[] args) {
	String s=new String("Hello World");
	StringBuilder sb=new StringBuilder(s);
	sb=sb.reverse();
	System.out.println(sb);
	}

}
