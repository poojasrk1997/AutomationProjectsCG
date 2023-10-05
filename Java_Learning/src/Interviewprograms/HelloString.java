package Interviewprograms;

public class HelloString {

	public static void main(String[] args) {

		
		String s = "ACHAAECCLWWLXXO";
		
		String[] split = s.split("");
		
		for (int i = 2; i < split.length; i = i + 3) {
		System.out.print(split[i]);
		}
		
	}

}
