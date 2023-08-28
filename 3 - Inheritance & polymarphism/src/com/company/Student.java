package com.company;
public class Student extends Person {
    private int studyLevel;
    private String specialization;
    private double gpa;
    public Student() {
        System.out.println("\t\tThe subclass constructor");
    }
    public Student(String name, double age, String address, String nationality, int studyLevel, String specialization, double gpa) {
        super(name, age, address, nationality);
        this.studyLevel = studyLevel;
        this.specialization = specialization;
        this.gpa = gpa;
    }

    public int getStudyLevel() {
        return studyLevel;
    }
    public void setStudyLevel(int studyLevel) {
        this.studyLevel = studyLevel;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        System.out.println(super.toString() ); //Call the toString method in super class
        return "Student{" +
                "studyLevel=" + studyLevel +
                ", specialization='" + specialization + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
