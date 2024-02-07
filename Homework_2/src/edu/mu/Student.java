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
}
