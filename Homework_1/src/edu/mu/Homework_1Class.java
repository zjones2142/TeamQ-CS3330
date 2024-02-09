package edu.mu;

public class Homework_1Class {

	public static void main(String[] args) {
			String array[][] = {
				{"Zach Jones", "zjones2142"},
				{"Rafa Bratfich de Oliveira", "nbrxtz"},
				{"Joseph Mun", "JosephMMun"},
				{"Matt Johnson", "nmdjvyz"}
			};
			for(int i=0;i<array.length;i++) {
				System.out.println("Member "+i+":");
				System.out.println(" Name: "+array[i][0]+"\n Git: "+array[i][1]+"\n");
			}
	}

}