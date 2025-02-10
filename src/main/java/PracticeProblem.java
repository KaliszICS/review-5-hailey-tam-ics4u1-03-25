import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
	 	Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		Double num = in.nextDouble();
		in.nextLine();
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number: ");
		Double num2 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		Double num3 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.floor(num2/num3));
		System.out.println(Math.ceil(num2/num3));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number: ");
		Double num4 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.sqrt(Math.round(num4)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number: ");
		Double num5 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		Double num6 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.pow(num5,num6));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a number: ");
		Double num7 = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		Double num8 = in.nextDouble();
		in.nextLine();
		System.out.print("Input one more number: ");
		Double num9 = in.nextDouble();
		in.nextLine();
		System.out.println(Math.max(Math.max(num7,num8),num9));
		System.out.println(Math.min(Math.min(num7,num8),num9));
	}
	public static void q6() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		System.out.println(sentence.contains("on"));
	}
	public static void q7() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input the word mango: ");
		String word = in.nextLine();
		System.out.println(word.equalsIgnoreCase("mango"));
	}
	public static void q8() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a word: ");
		String word2 = in.nextLine();
		System.out.print("Input a letter: ");
		String letter = in.nextLine();
		in.nextLine();
		System.out.println(word2.indexOf(letter));
	}

	public static void q9() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a sentence: ");
		String sentence2 = in.nextLine();
		System.out.print("Your sentence is length " + sentence2.length() + "characters long"); ;
	}
	public static void q10() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		System.out.print("Input a word to replace: ");
		String word = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String replace = in.nextLine();
		System.out.println(sentence.replaceAll(replace,word));
	}

	public static void q11() {
		//Write question 5 code here
	 	Scanner in = new Scanner (System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		System.out.println((sentence.toUpperCase()).trim());
		System.out.println((sentence.toLowerCase()).trim());
	}

	public static void q12() {
		//Write question 5 code here
		Scanner in = new Scanner (System.in);
		System.out.print("Input a word: ");
		String word = in.nextLine();
		System.out.println(word.substring(0,4));
		System.out.println(word.substring(4,0));
	}
	

}
