package com.aniket.JobApp;

import com.aniket.JobApp.model.JobPost;
import com.aniket.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JobController {

    private JobService service;

    @Autowired
    public void setService(JobService service) {
        this.service = service;
    }

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJobPost(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public ModelAndView viewAllJobs(ModelAndView modelAndView) {
        modelAndView.addObject("jobPosts", service.returnAllJobPost());
        modelAndView.setViewName("viewalljobs");
        return modelAndView;
    }
}
