package com.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class  DataOfStudents {
    public static Students STUDENT1 = new Students(1, "Alex", "Rint", 1998, "local str", "+380111", "Math", "2", "MAT-1");
    public static Students STUDENT2 = new Students(2, "Pedro", "Hock", 1999, "birg str", "+380222", "Historical", "1", "HIS-2");
    public static Students STUDENT3 = new Students(3, "John", "Mill", 1997, "wew str", "+380333", "Physical", "3", "PHIS-3");
    public static Students STUDENT4 = new Students(4, "Oliver", "Pent", 1998, "low str", "+380444", "Philosophy", "2", "PHIl-6");
    public static Students STUDENT5 = new Students(5, "Tom", "Ork", 1999, "bom str", "+380555", "Economy", "1", "ECO-4");
    public static Students STUDENT6 = new Students(6, "Michal", "Woun", 1998, "pourt str", "+380666", "Literature", "2", "LIT-5");
    public static Students STUDENT7 = new Students(7, "Robert", "Brin", 1997, "treel str", "+380777", "Historical", "3", "HIS-2");
    public static Students STUDENT8 = new Students(8, "Nick", "Clue", 1997, "koup str", "+380888", "Philosophy", "3", "PHIS-3");
    public static Students STUDENT9 = new Students(9, "Greg", "Tyle", 1999, "typer str", "+380999", "Economy", "1", "ECO-4");
    public static Students STUDENT10 = new Students(10, "Daniel", "Noun", 1998, "wonel str", "+3801212", "Math", "2", "MAT-1");

  //  List<Students> users = Arrays.asList(





    public static ArrayList<Students> arrayOfStudents = new ArrayList<Students>();
    public static void addStud(){
        arrayOfStudents.add(STUDENT1);
        arrayOfStudents.add(STUDENT2);
        arrayOfStudents.add(STUDENT3);
        arrayOfStudents.add(STUDENT4);
        arrayOfStudents.add(STUDENT5);
        arrayOfStudents.add(STUDENT6);
        arrayOfStudents.add(STUDENT7);
        arrayOfStudents.add(STUDENT8);
        arrayOfStudents.add(STUDENT9);
        arrayOfStudents.add(STUDENT10);
    }
}




