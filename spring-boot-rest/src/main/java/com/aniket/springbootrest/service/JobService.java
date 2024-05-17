package com.aniket.springbootrest.service;


import com.aniket.springbootrest.Repositry.JobRepo;
import com.aniket.springbootrest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {
    private JobRepo repo;

    @Autowired
    public void setRepo(JobRepo repo) {
        this.repo = repo;
    }

    public List<JobPost> returnAllJobPost() {
        return repo.findAll();
    }

    public void addJobPost(JobPost jobPost) {
        repo.save(jobPost);
    }

    public JobPost getJobPost(int jobPostId) {
        return repo.findById(jobPostId).orElse(new JobPost());
    }

    public void updateJobPost(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJobPost(int jobPostId) {
       repo.deleteById(jobPostId);
    }

    public String load() {
        //load some demo data for the testing purpose
         ArrayList<JobPost> list = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Engineer", "Develop and maintain web applications using modern technologies.", 0, Arrays.asList("Java", "Spring Boot", "React.js", "PostgreSQL")),
            new JobPost(2, "Data Scientist", "Analyze large datasets and develop predictive models for business insights.", 4, Arrays.asList("Python", "Pandas", "NumPy", "TensorFlow", "SQL")),
            new JobPost(3, "Java Developer", "Develop and maintain web applications using Spring Framework.", 4, Arrays.asList("Java", "Spring", "Hibernate", "React", "SQL")),
            new JobPost(4, "Frontend Developer", "Develop user-facing features using React.js and HTML/CSS.", 2, Arrays.asList("React.js", "JavaScript", "HTML", "CSS")),
            new JobPost(5, "Backend Developer", "Develop server-side logic using Java and Spring Framework.", 5, Arrays.asList("Java", "Spring", "Spring Boot", "Hibernate", "MySQL"))
         ));

        List<JobPost> status = repo.saveAll(list);
        return (status == null) ? "Failed" : "Success";
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
