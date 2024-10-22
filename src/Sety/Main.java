package Sety;

import Listy.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Student> setForStudent = new HashSet<>();

        setForStudent.add(new Student("Kasia","Studencka"));
        setForStudent.add(new Student("Marek", "Wybitny"));
        setForStudent.add(new Student("Kasia","Studencka"));

        showAllElements(setForStudent);


    }
    public static void showAllElements(Set<Student> set){

        for(Student element: set){
            System.out.println(element);
        }
    }


    }

