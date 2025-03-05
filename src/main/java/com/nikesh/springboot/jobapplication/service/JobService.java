package com.nikesh.springboot.jobapplication.service;

import com.nikesh.springboot.jobapplication.Job;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface JobService {

    List<Job> getAllJobs();
    ResponseEntity<Job> getJobById(long id);
    ResponseEntity<Job> addJob(Job job);
    ResponseEntity<Job> updateJob(long id, Job updatedJob);
    ResponseEntity<Void> deleteJob(long id);

}
