package com.nikesh.springboot.jobapplication.service;

import com.nikesh.springboot.jobapplication.Job;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    private final List<Job> jobList = new ArrayList<>();
    private long jobIdCounter = 1;

    public List<Job> getAllJobs() {
        return jobList;
    }

    public ResponseEntity<Job> getJobById(long id) {
        Optional<Job> job = jobList.stream().filter(j -> j.getId() == id).findFirst();
        return job.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Job> addJob(Job job) {
        job.setId(jobIdCounter++);
        jobList.add(job);
        return ResponseEntity.ok(job);
    }

    public ResponseEntity<Job>  updateJob(long id, Job updatedJob) {
        for (int i = 0; i < jobList.size(); i++) {
            Job existingJob = jobList.get(i);
            if (existingJob.getId() == id) {
                if (updatedJob.getTitle() != null) existingJob.setTitle(updatedJob.getTitle());
                if (updatedJob.getDescription() != null) existingJob.setDescription(updatedJob.getDescription());
                if (updatedJob.getMinSalary() != null) existingJob.setMinSalary(updatedJob.getMinSalary());
                if (updatedJob.getMaxSalary() != null) existingJob.setMaxSalary(updatedJob.getMaxSalary());
                if (updatedJob.getLocation() != null) existingJob.setLocation(updatedJob.getLocation());
                return ResponseEntity.ok(existingJob);
            }
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Void> deleteJob(long id) {
        boolean removed = jobList.removeIf(job -> job.getId() == id);
        return removed ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}