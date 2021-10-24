
public class Student {
	private String name;
	private int scores;
	
	public Student(String name, int scores) {  //이름, 점수 정보를 저장
		this.name = name;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}
}
