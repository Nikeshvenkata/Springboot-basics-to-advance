package com.nikesh.springboot.jobapplication.controller;

import com.nikesh.springboot.jobapplication.Job;
import com.nikesh.springboot.jobapplication.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable long id) {
        return jobService.getJobById(id);
    }

    @PostMapping
    public ResponseEntity<Job> addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Job> updateJob(@PathVariable long id, @RequestBody Job updatedJob) {
        return jobService.updateJob(id, updatedJob);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable long id) {
        return jobService.deleteJob(id);
    }
}