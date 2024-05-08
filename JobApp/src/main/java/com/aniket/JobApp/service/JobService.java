package com.aniket.JobApp.service;

import com.aniket.JobApp.Repositry.JobRepo;
import com.aniket.JobApp.model.JobPost;
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
}
