package com.fundamentals;

public class EnumExample {

	enum TrafficLight {
		RED, ORANGE, GREEN;
	}

	public static void main(String[] args) {

//		Example 1
//		 Iterating Enums using values() returns an array containing all the constants
//		 of the enum type in the exact order they are declared.
		TrafficLight[] light = TrafficLight.values();
		System.out.println("=============== Example 1 ========================");
		System.out.println("================== using value() =====================");
		for (TrafficLight color : light) {
			System.out.println("Traffic color : " + color);
		}
		System.out.println("=======================================");

//		Direct Reference or Qualified Reference.
		System.out.println("=============== Direct Reference ========================");
		TrafficLight lights = TrafficLight.GREEN;
		System.out.println("Color : " + lights);
		System.out.println("=======================================");

//		valueOf converts a String into an enum constant dynamically throws
//		 IllegalArgumentException if match not found because enum is case-sensitive.
		System.out.println("============== valueOf() =========================");
		try {
			TrafficLight color = TrafficLight.valueOf("GREEN");
			if (color == TrafficLight.GREEN) {
				System.out.println(" -> "+color + " Object is having same object reference as " + TrafficLight.GREEN.name());
				System.out.println(" -> Address of Color object  " + color.hashCode() + " and TrafficLight.GREEN object "
						+ TrafficLight.GREEN.hashCode());
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Mismatched");
		}

		System.out.println("============ name() ===========================");
//		Accessing the enum object passing to colors variable.
		TrafficLight colors = TrafficLight.GREEN;
//		 name() built-in final method that returns the exact name string.
		System.out.println("MY FAV COLOR : " + colors.name());
		System.out.println("=======================================");
	}

}
