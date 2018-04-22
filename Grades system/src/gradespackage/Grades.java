package gradespackage;

public class Grades {
	
	private String fName;
	private String lName;
	private int ids;
	private String exame;
	private String grades;
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getId() {
		return ids;
	}
	public void setId(int id) {
		this.ids = id;
	}
	public String getExame() {
		return exame;
	}
	public void setExame(String exame) {
		this.exame = exame;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Grades [fName=" + fName + ", lName=" + lName + ", id=" + ids + ", exame=" + exame + ", grades=" + grades
				+ "]";
	}
	
	
	

}
