package com.aniket.springbootrest.service;


import com.aniket.springbootrest.Repositry.JobRepo;
import com.aniket.springbootrest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private JobRepo repo;

    @Autowired
    public void setRepo(JobRepo repo) {
        this.repo = repo;
    }

    public List<JobPost> returnAllJobPost() {
        return repo.returnAllJobPost();
    }

    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);
    }

    public JobPost getJobPost(int jobPostId) {
        return repo.getJobPost(jobPostId);
    }

    public void updateJobPost(JobPost jobPost) {
        repo.updateJobPost(jobPost);
    }

    public void deleteJobPost(int jobPostId) {
        repo.deleteJobPost(jobPostId);
    }
}
