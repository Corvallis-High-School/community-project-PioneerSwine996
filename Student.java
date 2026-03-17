
public class Student extends FRCTeamMember {

	private double gpa;

	public Student() {
		super();
		this.gpa = 0.0;
	}

	public Student(String name, String subteam, double hours, double gpa) {
		super(name, subteam, hours);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void study(double extraHours) {
		addHours(extraHours);
		this.gpa += 0.01 * extraHours;
		if (this.gpa > 4.0) this.gpa = 4.0;
	}

	@Override
	public String toString() {
		return super.toString() + ", GPA: " + gpa;
	}

	@Override
	public void addHours(double moreHours) {
		super.addHours(moreHours);
		System.out.println(getName() + " studied/worked " + moreHours + " hours. Total now: " + getHours());
	}
}

