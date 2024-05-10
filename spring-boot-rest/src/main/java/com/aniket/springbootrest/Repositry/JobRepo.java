package com.aniket.springbootrest.Repositry;


import com.aniket.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Repository
public class JobRepo {

    ArrayList<JobPost> list = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Software Engineer", "Develop and maintain web applications using modern technologies.", 0, Arrays.asList("Java", "Spring Boot", "React.js", "PostgreSQL")),
            new JobPost(2, "Data Scientist", "Analyze large datasets and develop predictive models for business insights.", 4, Arrays.asList("Python", "Pandas", "NumPy", "TensorFlow", "SQL")),
            new JobPost(3, "Java Developer", "Develop and maintain web applications using Spring Framework.", 4, Arrays.asList("Java", "Spring", "Hibernate", "React", "SQL")),
            new JobPost(4, "Frontend Developer", "Develop user-facing features using React.js and HTML/CSS.", 2, Arrays.asList("React.js", "JavaScript", "HTML", "CSS")),
            new JobPost(5, "Backend Developer", "Develop server-side logic using Java and Spring Framework.", 5, Arrays.asList("Java", "Spring", "Spring Boot", "Hibernate", "MySQL"))
    ));

    public List<JobPost> returnAllJobPost() {
        return list;
    }

    public void addJobPost(JobPost jobPost) {
        list.add(jobPost);
        System.out.println(list);
    }

    public JobPost getJobPost(int jobPostId) {
        for (JobPost jobPost : list) {
            if (jobPostId == jobPost.getPostId()) {
                return jobPost;
            }
        }
        //not found the post
        return null;
    }

    public void updateJobPost(JobPost jobPost) {
        for (JobPost job : list) {
            if (job.getPostId() == jobPost.getPostId()) {
                job.setPostDesc(jobPost.getPostDesc());
                job.setPostTechStack(jobPost.getPostTechStack());
                job.setPostProfile(jobPost.getPostProfile());
                job.setReqExperience(jobPost.getReqExperience());
            }
        }
    }

    public void deleteJobPost(int jobPostId) {
        /*The java.util.ConcurrentModificationException occurs when you try to modify a collection while iterating over it using an iterator. This exception typically happens when you try to add, remove, or modify elements in a collection while iterating over it using the enhanced for-loop or an iterator's next() method.*/
//        for (JobPost jobPost : list) {
//            if (jobPost.getPostId() == jobPostId) {
//                list.remove(jobPost);
//            }
//        }

//        Predicate<JobPost> predicate = jobPost -> (jobPost.getPostId() == jobPostId);

        list.removeIf(jobPost -> jobPost.getPostId() == jobPostId);
    }

//    public void printList() {
//         list.forEach(job -> System.out.println(job + ", "));
//    }
}


//class demo {
//    public static void main(String[] args) {
//        JobRepo repo = new JobRepo();
//        repo.deleteJobPost(1);
//        repo.printList();
//    }
//}