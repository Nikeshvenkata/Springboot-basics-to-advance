package com.nikesh.springboot.jobapplication.repository;

import com.nikesh.springboot.jobapplication.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}
