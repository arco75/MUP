package Listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Student> listaStudentow = new LinkedList<>();

        Student student = new Student("Jan", "Sowa");
        listaStudentow.add(student);

        listaStudentow.add(new Student("Alicja","Kot"));
        listaStudentow.add(new Student("Tomasz","Nowak"));

        showList(listaStudentow);


    }

    public static void showList(LinkedList<Student> lista){
     for(Student element: lista){
         System.out.println(element);
     }
    }
}
