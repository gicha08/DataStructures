package apps;

public class Practice2 {

	static int addTwo(int a, int b){
//		int c;
//		c = a + b;
		//System.out.println(c);
		return a+b;
	}
	static void displayGradeForScore(double score) {
		// final grade is A if score >= 90
		// B if 80 <= score < 90
		// C if 70 <= score < 80
		// D if 60 <= score < 70
		// f if score < 60
		if(score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else // score < 60 
			System.out.println("F");
	}
	static String score2letterGrade(double score) {
		// final grade is A if score >= 90
		// B if 80 <= score < 90
		// C if 70 <= score < 80
		// D if 60 <= score < 70
		// f if score < 60
		if(score >= 90)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 60)
			return "D";
		else // score < 60 
			return "F";
	}
	public static void main(String[] args) {
	
//		System.out.println(addTwo(2, 3));
//		System.out.println(addTwo(-10, 3));
//		System.out.println(addTwo(5, 0));
		
//		displayGradeForScore(96);
//		displayGradeForScore(102);
//		displayGradeForScore(89.9);
//		displayGradeForScore(75);
//		displayGradeForScore(62.6);
//		displayGradeForScore(-2);
		
//		System.out.println(score2letterGrade(96));
		
		String s1 = "Hello World";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);

		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.pow(3, 2));
		
	}
}
