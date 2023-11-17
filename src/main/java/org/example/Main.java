package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1=Student.builder()
                .name("Luci")
                .address("Cervantesstr7,München")
                .grade("5,3,1")
                .id("1")
                .build();
        Student student2=Student.builder()
                .name("Karl")
                .address("Kirchstr.4,München")
                .grade("4,3,1")
                .id("2")
                .build();
        Student student3=Student.builder()
                .name("Emi")
                .address("Austr 1,München")
                .grade("3,3,1")
                .id("3")
                .build();
        System.out.println("Ein Student: "+student2.toString());
        List<Student> students1= new ArrayList<Student>(){{
            add(student1);
            add(student3);
            add(student2);
        }};
        List<Student> students2= new ArrayList<Student>(){{
            add(student1);
            add(student3);
            //add(student2);
        }};
        List<Student> students3= new ArrayList<Student>(){{
            add(student2);
            add(student3);
            //add(student2);
        }};


        Teacher teacher1=Teacher.builder()
                .id("1")
                .name("Maier")
                .subject("Info1")
                .build();
        System.out.println("Ein Lehrer: "+teacher1.toString());
        Teacher teacher2=Teacher.builder()
                .id("1")
                .name("Veit")
                .subject("Datenbanken")
                .build();
        Course cours1=Course.builder()
                .id("1")
                .name("Datenbanken")
                .teacher("Veit")
                .students(students1)
                .build();
        System.out.println("Ein Kurs:"+cours1.toString());
        System.out.println("Der Lehrer vom Kurs1 heißt:"+cours1.getTeacher());
        //ändere die Studentenliste
        cours1.setStudents(students3);
        System.out.println("Der Kurs hat sich wie folgt: "+cours1.toString());
        Course course2=Course.builder()
                .id("1")
                .name("Info")
                .teacher("Maier")
                .students(students2)
                .build();

    }

}