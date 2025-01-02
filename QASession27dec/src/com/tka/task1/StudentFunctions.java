package com.tka.task1;

public class StudentFunctions {
	Students[] studentDetails() {
		Students[] details=new Students[5];
		details[0]=new Students("khushi",89);
		details[1]=new Students("Priti",79);
		details[2]=new Students("Chaya",49);
		details[3]=new Students("Jay",56);
		details[4]=new Students("Viru",99);
		return details;
		}
	
		void MarksGreaterThan80(Students[] details) {
			for(int i= 0; i<details.length;i++) {
				if(details[i].getMarks()>80) {
					System.out.println(details[i].getSname());
				}
			}
		}
}
