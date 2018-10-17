package com.company;


class Student{
    private String name;
    private int age;
    public Student(){
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getInformation(){
        return "Student{"+"name = "+name+" age = "+age+"}";
    }
}
class StudentManager{
    private Student[] students = new Student[20];
    private int size;
    public StudentManager(){
    }
    public void add(Student student){
        students[size] = student;
        size++;
    }
    public void displayAll(){
        if(size == 0 ) System.out.println("There is no any student in list");
        else if(size == 1){
            System.out.println("there is 1 student in list");
            System.out.println(students[0].getInformation());
        }
        else{
            System.out.println("there are "+ size +"students in list");
            for(int i = 0; i<size;i++){
                System.out.println(students[i].getInformation());

            }
        }
    }
    public void find(String name){
        int found = 0;
        for(int i=0;i<size;i++){
            boolean match = students[i].getName().equals(name);
            if(match){
                System.out.println("The position of student \""+name+"\"in the list "+(i+1));
                found++;
                break;
            }
        }
        boolean notFound = found == 0;
        if(notFound) System.out.println("There no student with name "+name+" in the list");
    }
}

public class Main {

    public static void main(String[] args) {
        Student andy = new Student("andy",23);
        StudentManager studentManager = new StudentManager();
        studentManager.add(andy);
        System.out.println("added"+andy.getInformation());
        studentManager.displayAll();
        Student samy = new Student("Samy",22);
        studentManager.add(samy);
        System.out.println("added"+samy.getInformation());
        studentManager.displayAll();
        Student booby = new Student("Booby",25);
        studentManager.add(booby);
        System.out.println("added"+booby.getInformation());
        studentManager.displayAll();
        studentManager.find("andy");
        studentManager.find("Michael");
        studentManager.find("Sony");

    }
}
