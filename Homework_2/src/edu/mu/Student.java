package edu.mu;
// add comment
public class Student {
	private int id;
	private String firstName;
    private String lastName;
    private double grade;
	
    public Student(int id, String firstName, String lastName, double grade) {
		this.id = id;
		this.firstName = firstName;
        this.lastName = lastName;
		this.grade = grade;
	}
	
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "  Name: " + getFullName() + "\n  ID: " + id + "\n  Grade: " + grade + "\n";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
