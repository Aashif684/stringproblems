package Stringprograms;

public class firstcharacterofeveryword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World How Are U";
				char arr[]=str.toCharArray();
				for(int i=0;i<arr.length;i++) {
					if(arr[i] !=' ') {
						if(i==0) {
							System.out.println(arr[i]);
						}
							else if(arr[i-1]==' ') {
								System.out.println(arr[i]);
							}
						}
					}
				

	}

}
