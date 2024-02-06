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
		return "Name: " + name + "\nID: " + Integer.toString(id) + "\nGrade: " + Double.toString(grade) + "\n";
	}
}
