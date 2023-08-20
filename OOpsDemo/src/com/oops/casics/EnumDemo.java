package com.oops.casics;

enum Weekdays{
	MONDAY,TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekdays weekday = Weekdays.FRIDAY;
		//Convert enum to string
		System.out.println(weekday.name());
		//to get index(ordinal) from enum starts from0
		System.out.println(weekday.ordinal());
		//static method so call in static way
		Weekdays []weekdaysArr=Weekdays.values();
		
		for(Weekdays weekdays:weekdaysArr){
		System.out.println(weekdays.name());}
		
        System.out.println("Convert String to enum constant");
        weekday=Weekdays.valueOf("Monday");
        System.out.println(weekday);
	}

}
