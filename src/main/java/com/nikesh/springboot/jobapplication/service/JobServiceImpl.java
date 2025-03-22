package com.nikesh.springboot.jobapplication.service;

import com.nikesh.springboot.jobapplication.Job;
import com.nikesh.springboot.jobapplication.repository.JobRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    JobRepository jobRepository;
    private long jobIdCounter = 1;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public ResponseEntity<Job> getJobById(long id) {
        Optional<Job> job = jobRepository.findById(id);
        return job.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Job> addJob(Job job) {
        jobRepository.save(job);
        return ResponseEntity.ok(job);
    }

    public ResponseEntity<Job> updateJob(long id, Job updatedJob) {
        Optional<Job> jobOptional = jobRepository.findById(id);
        if (jobOptional.isPresent()) {
            Job existingJob = jobOptional.get();
            if (updatedJob.getTitle() != null) existingJob.setTitle(updatedJob.getTitle());
            if (updatedJob.getDescription() != null) existingJob.setDescription(updatedJob.getDescription());
            if (updatedJob.getMinSalary() != null) existingJob.setMinSalary(updatedJob.getMinSalary());
            if (updatedJob.getMaxSalary() != null) existingJob.setMaxSalary(updatedJob.getMaxSalary());
            if (updatedJob.getLocation() != null) existingJob.setLocation(updatedJob.getLocation());

            Job savedJob = jobRepository.save(existingJob);
            return ResponseEntity.ok(savedJob);
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Void> deleteJob(long id) {
        try {
            jobRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}