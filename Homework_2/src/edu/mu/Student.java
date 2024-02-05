package edu.mu;

public class Student {
	private int id;
	private String name;
	private double grade;
	
	private Student setStudent(int id, String name, double grade) {
		Student stu = null;
		stu.id = id;
		stu.name = name;
		stu.grade = grade;
		return stu;
	}
	
	public String sToString() {
		return "Name: " + this.name + "\nID: " + Integer.toString(this.id) + "\nGrade: " + Double.toString(this.grade) + "\n";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = null;
		student1.setStudent(0, "John", 3.0);
		System.out.println(student1.sToString());
	}

}
