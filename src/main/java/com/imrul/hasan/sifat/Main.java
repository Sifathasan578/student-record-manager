package com.imrul.hasan.sifat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            long id = scanner.nextLong();
            scanner.nextLine();

            System.out.print("Enter Full Name: ");
            String fullName = scanner.nextLine();

            System.out.print("Enter Blood Group: ");
            String bloodGroup = scanner.nextLine();

            System.out.print("Enter CGPA: ");
            float cgpa = scanner.nextFloat();
            scanner.nextLine();

            students.add(new Student(id, fullName, bloodGroup, cgpa));
        }

        System.out.print("Enter Query: ");
        String query = scanner.nextLine();

        System.out.println("\nStudent Information Based on Matching Criteria");
        for (Student matchingStudent : students) {
            if(matchingStudent.matchingCriteriaCheck(query)) {
                matchingStudent.display();
                System.out.println();
            }
        }

        System.out.println("\nStudent Information Based on Lowest CGPA");
        Student studentWithLowestCgpa = findStudentWithLowestCgpa(students);
        studentWithLowestCgpa.display();
        System.out.println();
    }

    public static Student findStudentWithLowestCgpa(ArrayList<Student> student) {
        Student studentWithLowestCGPA = student.get(0);
        float lowestCgpa = studentWithLowestCGPA.getCgpa();

        for(int i = 0; i < student.size(); i++) {
            if(student.get(i).getCgpa() < lowestCgpa) {
                lowestCgpa = student.get(i).getCgpa();
                studentWithLowestCGPA = student.get(i);
            }

        }

        return studentWithLowestCGPA;
    }
}
