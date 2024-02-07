package edu.mu;
// add comment
public class Student {
	private int id;
	private String name;
	private double grade;
	
	public Student(int id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public String toString() {
		return "  Name: " + name + "\n  ID: " + Integer.toString(id) + "\n  Grade: " + Double.toString(grade) + "\n";
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

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
