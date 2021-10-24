import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		Scanner in = new Scanner(System.in);
		boolean done = false;

		// Read the students names and scores, and add them to studSc
		do {
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine();
			if (name.equals("-1"))
				done = true;
			else {
				System.out.println("Enter the student's score: ");
				int score = in.nextInt();
				in.nextLine(); // skip the end-of-line character
				
				studSc.add(name, score); //studSc 배열에 하나씩 추가
				
			}
		} while (!done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		
		System.out.print("최고 점수를 받은 학생은 " + studSc.getHighestStudent() + "이고, ");
		System.out.println("최고 점수는 " + studSc.getHighestScore() + "입니다.");
		
		System.out.print("최저 점수를 받은 학생은 " + studSc.getLowestStudent() + "이고, ");
		System.out.println("최저 점수는 " + studSc.getLowestScore() + "입니다.");
		
		in.close();
	}
}
