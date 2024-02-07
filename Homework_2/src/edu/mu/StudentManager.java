package edu.mu;
import java.util.*;
import java.io.*;

public class StudentManager{
		
		private Student[] students;
		private int size;
		
		public boolean readFromFile(String fileName) {
		    try {
		        File file = new File(fileName);
		        FileInputStream fileInputStream = new FileInputStream(file);
		        Scanner scanner = new Scanner(fileInputStream);
		        students = new Student[10]; //initial size of the array
		        int arraySize = 0;

		        while (scanner.hasNextLine()) {
		            String line = scanner.nextLine();
		            String[] data = line.split(" "); //separately store student id, name, and grade

		            if (data.length != 3) {
		                System.err.println("Student data format is wrong in file: " + fileName);
		                return false;
		            }

		            //initiate variables that will store student info
		            int id = Integer.parseInt(data[0]);
		            String name = data[1];
		            double grade = Double.parseDouble(data[2]);

		            if (arraySize == students.length) {
		                //increase array length when it's full
		                Student[] temp = new Student[students.length * 2];
		                //copy the elements from students array to the temp array
		                for (int i = 0; i < arraySize; i++) {
		                    temp[i] = students[i];
		                }
		                students = temp;
		            }

		            //add student to the array
		            students[arraySize++] = new Student(id, name, grade);
		        }

		        scanner.close();
		        return true;
		    } catch (FileNotFoundException e) {
		        System.err.println("File not found: " + fileName);
		        return false;
		    } catch (NumberFormatException e) {
		        System.err.println("Invalid data format in file: " + fileName);
		        return false;
		    }
		}
			
		public void displayStudents() {
			if (size == 0) {
				System.out.println("No students to display.");
		        return;
		    }

		    for (int i = 0; i < size; i++) {
		        System.out.println(students[i].toString());
		    }
		}
		
		public boolean searchStudentById(int id) {
		    if (students == null || students.length == 0) {
		        System.out.println("No students available for search.");
		        return false;
		    }

		    for (Student student : students) {
		        if (student != null && student.getId() == id) {
		            System.out.println("Student found:");
		            System.out.println(student.toString());
		            return true;
		        }
		    }

		    System.out.println("Student with ID " + id + " not found.");
		    return false;
		}
		
		public boolean updateStudentGradeById(int id, double grade) {
		    if (students == null || students.length == 0) {
		        System.out.println("No students available to update.");
		        return false;
		    }

		    for (Student student : students) {
		        if (student != null && student.getId() == id) {
		            student.setGrade(grade);
		            System.out.println("Student grade updated successfully:");
		            System.out.println(student.toString());
		            return true;
		        }
		    }

		    System.out.println("Student with ID " + id + " not found.");
		    return false;
		}

	}
