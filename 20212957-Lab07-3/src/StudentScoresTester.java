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
				
				studSc.add(name, score); //studSc �迭�� �ϳ��� �߰�
				
			}
		} while (!done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		
		System.out.print("�ְ� ������ ���� �л��� " + studSc.getHighestStudent() + "�̰�, ");
		System.out.println("�ְ� ������ " + studSc.getHighestScore() + "�Դϴ�.");
		
		System.out.print("���� ������ ���� �л��� " + studSc.getLowestStudent() + "�̰�, ");
		System.out.println("���� ������ " + studSc.getLowestScore() + "�Դϴ�.");
		
		in.close();
	}
}
