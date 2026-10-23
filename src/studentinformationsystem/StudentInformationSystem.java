/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        // Display student name and student ID [1]
        System.out.println("Student Name: [Your Full Name Here]");
        System.out.println("Student ID: [Your Student ID Here]");
        
        // Store two marks using variables [1]
        int mark1 = 75; // Example mark
        int mark2 = 80; // Example mark

        // Calculate the total mark [1]
        int totalMark = mark1 + mark2;

        // Display the individual marks and the total [1]
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + totalMark);

        // Display a message based on the total [1]
        if (totalMark >= 150) { // Assuming marks are out of 100 each, total out of 200
            System.out.println("Result: Excellent");
        } else if (totalMark >= 100) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
