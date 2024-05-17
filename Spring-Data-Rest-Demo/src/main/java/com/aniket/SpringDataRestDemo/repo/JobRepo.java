package com.aniket.SpringDataRestDemo.repo;


import com.aniket.SpringDataRestDemo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {


}
