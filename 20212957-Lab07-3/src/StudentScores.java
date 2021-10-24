public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private Student[] student;
	private int numStudents;
	private int highestScore;
	private int lowestScore;
	

	public StudentScores() {
		student = new Student[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		student[numStudents] = new Student(name, score);
		numStudents++;
	}

	public String getHighestStudent() { 
		if (numStudents == 0)
			return null;

		int highestScore = student[0].getScores();
		int highestIdx = 0; //최고점수의 인덱스를 저장

		for (int i = 1; i < numStudents; i++) {
			if (student[i].getScores() > highestScore) {
				highestIdx = i;
				highestScore = student[highestIdx].getScores();
			}
		}
		this.highestScore = highestScore; // 지역변수를 전역변수에 저장	
		
		return student[highestIdx].getName(); //최고점수를 받은 학생 이름을 반환
	}

	public String getLowestStudent() { 
		if (numStudents == 0)
			return null;

		int lowestScore = student[0].getScores();
		int lowestIdx = 0; //최저점수의 인덱스를 저장

		for (int i = 1; i < numStudents; i++) {
			if (student[i].getScores() < lowestScore) {
				lowestIdx = i;
				lowestScore = student[lowestIdx].getScores();
			}
		}
		this.lowestScore = lowestScore;
		
		return student[lowestIdx].getName(); //최저점수를 받은 학생 이름을 반환
	}

	public int getHighestScore() { 
		return highestScore; //최고점수를 반환
	}

	public int getLowestScore() { 
		return lowestScore; //최저점수를 반환
	}
}
