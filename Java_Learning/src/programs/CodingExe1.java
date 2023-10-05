package programs;

public class CodingExe1 {

	public static void main(String[] args) {
		String s="AHCECLWLXO";
		
		String[] str=s.split("");
		
		for(int i=1;i<str.length;i=i+2) {
			
			System.out.print(str[i]);
		}
		
		
	}

}
