package com.selenium;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static com.selenium.DataOfStudents.*;

public class Cases<Collect> {
    DataOfStudents data = new DataOfStudents();
    // COLLECT
    // - список студентов заданного факультета;

    public static List<Students> listByFaculty(String facultyName) {
        List<Students> collectList = arrayOfStudents.stream()
                .filter(s -> s.getFaculty().equals(facultyName))
                .collect(Collectors.toList());
        return collectList;
    }


    //    - списки студентов для каждого факультета и курса;
//    public static List<Students> listOfFaculty_Course(String facultyName) {
//    Map<Long, String> map = students
//            .stream()
//            .collect
//                    (Collectors.toMap(Students::getFaculty, Students::getCourse));
//


    }



    //    - список студентов, родившихся после заданного года;



    //    - студента, родившихся после заданного года;



    //    - список учебной группы в формате Фамилия, Имя, Отчество (List<String>).



