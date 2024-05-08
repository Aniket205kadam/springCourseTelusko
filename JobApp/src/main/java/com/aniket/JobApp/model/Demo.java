package com.aniket.JobApp.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
//        JobPost jobPost = new JobPost(101, "Java Dev",
//                "We are building the webApp using spring boot", 1,
//                Arrays.asList("Java", "Spring Boot", "React"));
//
//        System.out.println(jobPost);


        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(1, 2, 3);
        list.add(2);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        list1.add(2);
        System.out.println(list1);
    }
}
