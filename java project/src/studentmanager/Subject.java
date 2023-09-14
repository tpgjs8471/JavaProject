package studentmanager;

public class Subject {
	/*	과목클래스: 한 과목의 기본정보를 나타내는 클래스
	 * 	-과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표
	 * 	-멤버변수 선언, 생성자, getter/setter, 그 외 필요한 메서드(toString, print메서드 정도)
	 */
	private int subjectCode;
	private String subjectName;
	private int score;
	private int hour;
	private String professorName;
	private int semester;
	private String schedule;
	
	public Subject() {
		this.subjectCode = (Integer) null;
		this.subjectName = null;
		this.score = (Integer) null;
		this.hour = (Integer) null;
		this.professorName = null;
		this.semester = (Integer) null;
		this.schedule = null;
	}
	
	public Subject(int deleteNum) {
		this.subjectCode = deleteNum;
		this.subjectName = null;
		this.score = (Integer) null;
		this.hour = (Integer) null;
		this.professorName = null;
		this.semester = (Integer) null;
		this.schedule = null;
	}
	
	public Subject(int subjectCode, String subjectName, int score, int hour, String professorName, int semester, String schedule) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.score = score;
		this.hour = hour;
		this.professorName = professorName;
		this.semester = semester;
		this.schedule = schedule;
	}

	public int getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", score=" + score + ", hour="
				+ hour + ", professorName=" + professorName + ", semester=" + semester + ", schedule=" + schedule + "]";
	}
	
	
	
	
}