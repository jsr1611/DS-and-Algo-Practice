package HackerRank;/*
Author: Jumanazar Saidov
Date: 2021-10-26
Definition:
Task
You are given two classes, Person and Student,
where Person is the base class and Student is the derived class.
Completed code for Person and a declaration for Student are provided for you in the editor.
Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has 4 parameters:
A string, firstName.
A string, lastName.
An integer, idNumber.
An integer array (or vector) of test scores, scores.
A char calculate() method that calculates a Student object's average
and returns the grade character representative of their calculated average.
 link: https://www.hackerrank.com/challenges/30-inheritance/problem?h_r=email&unlock_token=2951f6d89bfdda49a9b5d66f09bcd09f8d1e1c3a&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 */

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int idNumber, int[] scores){
        super(firstName, lastName, idNumber);
        this.testScores = scores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate(){
        int total = 0;
        double avg = 0.0D;
        for(int i=0; i < this.testScores.length; i++){
            total += this.testScores[i];
        }
        avg = total / this.testScores.length;
        if(avg>= 90){
            return 'O';
        }
        else if(avg>=80){
            return 'E';
        }
        else if(avg>=70){
            return 'A';
        }
        else if(avg>=55){
            return 'P';
        }
        else if(avg>=40){
            return 'D';
        }
        else{
            return 'T';
        }
    }
}

class Solution {