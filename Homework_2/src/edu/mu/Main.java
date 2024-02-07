package edu.mu;

public class Main {

	public static void main(String[] args) {
		//TODO: POPULATE ARRAY WITH DATA FROM students.txt
			//Provided with StudentManager (probably)
		Student students[] = {new Student(0,"John",3.0)};
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Student "+(i+1)+":\n"+students[i].toString());
		}
	}
}
