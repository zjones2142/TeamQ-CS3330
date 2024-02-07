package edu.mu;

public class Main {

	public static void main(String[] args) {
		//TODO: POPULATE ARRAY WITH DATA FROM students.txt
			//Provided with StudentManager (probably)
		Student student1[] = {new Student(0,"John",3.0)};
		for(int i=0; i<student1.length ;i++)
		{
			System.out.println(student1[i]);
		}
	}
}
