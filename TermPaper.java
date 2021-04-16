public class TermPaper {
	
	private String authorName;
	private String subject;
	private String grade;
	
	/*public TermPaper(String cAuthorName, String cSubject, String cGrade) {
		setAuthorName(cAuthorName);
		setSubject(cSubject);
		setGrade(cGrade);
	}*/
	
	public void setAuthorName(String sAuthorName) {
		authorName = sAuthorName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setSubject(String sSubject) {
		subject = sSubject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setGrade(String sGrade) {
		grade = sGrade;
	}
	
	public String getGrade() {
		return grade;
	}
}