package Stringprograms;
import java.util.*;
public class avgosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
System.out.println(avgOf(s));
	}
	public static int avgOf(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum=sum+(int)s.charAt(i);
		}
		return sum;
	}

}
