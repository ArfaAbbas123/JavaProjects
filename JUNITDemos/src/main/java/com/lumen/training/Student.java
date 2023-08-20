package com.lumen.training;

import com.lumen.exception.NegValueException;

public class Student {
	public int totalMarks(int mark1, int mark2, int mark3) {
		if(mark1<0 || mark2<0 ||  mark3<0) 
			throw new NegValueException();
		if(mark1>100 || mark2>100 || mark3>100)
			throw new NegValueException();
		return(mark1+mark2+mark3);
	}	
	public String getGrades(int...marks) {
        int sum=0;
        for(int mark:marks)
            sum+=mark;
        double average;
        average=sum/(marks.length);
        char grade=' ';
        if(average>90 && average<=100)
            grade='A';
        else if(average>80 && average<=90)
            grade='B';
        else if(average>70 && average<=80)
            grade='C';
        else if(average>60 && average<=70)
            grade='D';
        else if(average>50 && average<=60)
            grade='E';
        else
            grade='F';
        return toString();
	}
}
