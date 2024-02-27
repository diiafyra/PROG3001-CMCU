/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bài5;

 class Student
{
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    public void calculateScholarship()
    {
        if(gpa>3){
            System.out.println("Duy tri hoc bong");
        } else
        {
            System.out.println("Het hoc bong");
        }
    }
    
}
public class Bài5 {
    public static void main(String[] args) {
        Student sample = new Student("Trang di", 18, 3.7);
        sample.setName("Nguyen Trang");
        System.out.println("Sinh viên: " +sample.getName() +" có GPA" +sample.getGpa());
        sample.calculateScholarship();
    }
    
}
