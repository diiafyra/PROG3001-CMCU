/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b22;

 class Person
{
     protected String name;
     protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     
    public void displayInfo(){
        System.out.println("Tên: "+ name);
        System.out.println("Tuổi: "+ age);
    }
 }
class Teacher extends Person{
    private String teacherId;
    
    public Teacher(String name, int age, String teacherId) {
        super(name, age);
        this.teacherId = teacherId;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Teacher ID: "+ teacherId);
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
public class B22 {


    public static void main(String[] args) {
        Teacher teacher = new Teacher("Hồng Trần", 19, "12345");
        teacher.displayInfo();
    }
    
}
