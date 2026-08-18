package anand.cloning.deep;

public class Student implements Cloneable {
	private int id;
	private String name;
	private Course course;

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student object = (Student) super.clone();
		object.course = (Course) course.clone();
		return object;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

}