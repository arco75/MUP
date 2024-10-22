package Listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Student> studentList1 = new LinkedList<>();
        ArrayList<Student> studentList2 = new ArrayList<>();

        studentList1.add(new Student("Jan", "Sowa"));
        studentList1.add(new Student("Alicja","Kot"));
        studentList1.add(new Student("Tomasz","Nowak"));

        studentList2.add(new Student("Marek", "Kowal"));
        studentList2.add(new Student("Anna","Kowalska"));
        studentList2.add(new Student("Tomasz","Nowak"));

        showList(studentList1);
       // showList(studentList2);       //niedozwolone bo metoda przyjmyje LinkedList

        showElements(studentList1);     //dozwolone - zobacz metodę, (interface List)
        showElements(studentList2);     //dozwolone - zobacz metodę, (interface List)
    }

    public static void showList(LinkedList<Student> lista){ //tylko dla LinkedList
     for(Student element: lista){
         System.out.println(element);
     }
    }
    public static void showElements(List<Student> lista){ //dla LinkedList i ArrayList
        for(Student element: lista){
            System.out.println(element);
        }

    }

}
