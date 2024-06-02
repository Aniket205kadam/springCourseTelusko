package com.aniket.springbootrest.Controller;

import com.aniket.springbootrest.model.JobPost;
import com.aniket.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    private JobService service;

    @Autowired
    public void setService(JobService service) {
        this.service = service;
    }

//    @GetMapping("jobPosts")
////    @ResponseBody
//    public List<JobPost> getAllJobs() {
//        return service.returnAllJobPost();
//    }

//    @GetMapping(path = "jobPosts", produces = {"application/json"})
//    public List<JobPost> getAllJobs() {
//        return service.returnAllJobPost();
//    }

    //search the specific job post
    @GetMapping("jobPost/{jobPostId}") ///{name}
    public JobPost getJobPost(@PathVariable("jobPostId") int jobPostId) { //, @PathVariable String name
//        System.out.println("Name: "+ name);
        return service.getJobPost(jobPostId);
    }

    //add the job post
    @PostMapping(path = "jobPost" , consumes = {"application/json"})
    public JobPost addJobPost(@RequestBody JobPost jobPost) {
        return service.getJobPost(jobPost.getPostId());
    }

    //update the job post
    @PutMapping("jobPost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost) {
        service.updateJobPost(jobPost);

        return service.getJobPost(jobPost.getPostId());
    }

    //delete the job post
    @DeleteMapping("jobPost/{jobPostId}")
    public String deleteJobPost(@PathVariable("jobPostId") int jobPostId) {
        service.deleteJobPost(jobPostId);
        return "Job post remove successfully";
    }

    //load some demo data for testing purpose
    @GetMapping("load")
    public String loadDemoData() {
        return  service.load();
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable String keyword) {
        return service.search(keyword);
    }

    @GetMapping("jobPosts")
    public ResponseEntity<List<JobPost>> getAllJobs() {
//        return new ResponseEntity<>(service.returnAllJobPost(), HttpStatus.ACCEPTED);
        return ResponseEntity.ok(service.returnAllJobPost());
    }
}
