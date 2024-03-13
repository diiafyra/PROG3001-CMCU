/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b20;

 class Person
{
     protected String name;
     protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
     
    public void displayInfo(){
        System.out.println("Tên: "+ name);
        System.out.println("Tuổi: "+ age);
    }
 }

class Student extends Person{
    private String studentId;
    
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    public void displayStudentInfo(){
        System.out.println("Tên: "+ name);
        System.out.println("Tuổi: "+ age);
        System.out.println("Mã sinh viên "+ studentId);
    }
}

public class B20 {
    public static void main(String[] args) {
        Student std1 = new Student("Nguyễn Tiến Dũng", 21, "CMCUNI12345");
        std1.displayInfo();
        
    }  
}