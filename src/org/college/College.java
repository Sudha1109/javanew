package org.college;

public class College {
	private void collegeCode() {

		System.out.println("College Code: 9876");
	}

	private void collegeName() {

		System.out.println("College Name: AZ College");
	}

	private void collegeRank() {

		System.out.println("College Rank: 12");
	}

	public static void main(String[] args) {

		College collegeClass = new College();
		collegeClass.collegeCode();
		collegeClass.collegeName();
		collegeClass.collegeRank();
		
	
	}

}
