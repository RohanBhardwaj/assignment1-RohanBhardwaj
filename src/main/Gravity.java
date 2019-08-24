/*
 * @author Rohan Bhardwaj
 * @version 1.0
 **/
package main;

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
        double time, speed, distance;
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextDouble();
        double gravityConstant = 9.8;
        speed = gravityConstant * time; //calculates speed
        distance = (gravityConstant * time * time) / 2; //calculates distance
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
