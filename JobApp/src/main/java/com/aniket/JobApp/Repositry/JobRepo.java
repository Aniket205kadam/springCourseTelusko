package com.aniket.JobApp.Repositry;

import com.aniket.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    ArrayList<JobPost> list = new ArrayList<>(Arrays.asList(
            new JobPost(101, "Software Engineer", "Develop and maintain web applications using modern technologies.", 0, Arrays.asList("Java", "Spring Boot", "React.js", "PostgreSQL")),
            new JobPost(102, "Data Scientist", " Analyze large datasets and develop predictive models for business insights.", 4, Arrays.asList("Python", "Pandas", "NumPy", "TensorFlow", "SQL"))
    ));

    public List<JobPost> returnAllJobPost() {
        return list;
    }

    public void addJobPost(JobPost jobPost) {
        list.add(jobPost);
        System.out.println(list);
    }
}
