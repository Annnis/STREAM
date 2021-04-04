package com.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static com.selenium.DataOfStudents.*;

public class Tests {

        ArrayList<Students> arrayList= new ArrayList<>();

        @BeforeEach
        public void setUp(){
            DataOfStudents.addStud();
        }

        @Test
        public void test_getFaculty(){
            arrayList.add(STUDENT5);
            arrayList.add(STUDENT9);
            List<Students> actual = Cases.listByFaculty("Economy");
            List<Students> expected = arrayList;
            Assertions.assertEquals(actual, expected);
        }
    }
