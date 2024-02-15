/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ex3;

/**
 *
 * @author DELL
 */
public class Student {
    private String name;
    private String sex;
    private String birth;
    private String studentID;
    
    //Constructer có đối
    public Student(String name, String sex, String birth, String studentID){
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.studentID = studentID;
    }
    //Constructer không đối
     public Student(){
        name = "Trang Di";
        this.sex = "Nu";
        this.birth = "22062005";
        this.studentID = "BIT22062005";
    }  
     //Các hàm set
        public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    //Các hàm get
    public String getSex(){
        return sex;
    }
    public String getName(){
        return name;
    }
        public String getBirth(){
        return birth;
    }
            public String getStudentID(){
        return studentID;
    }
}