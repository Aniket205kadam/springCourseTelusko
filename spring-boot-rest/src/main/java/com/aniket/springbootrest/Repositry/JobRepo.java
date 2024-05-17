package com.aniket.springbootrest.Repositry;


import com.aniket.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}

//    public void printList() {
//         list.forEach(job -> System.out.println(job + ", "));
//    }
//}


//class demo {
//    public static void main(String[] args) {
//        JobRepo repo = new JobRepo();
//        repo.deleteJobPost(1);
//        repo.printList();
//    }
//}


// public List<JobPost> returnAllJobPost() {
//        return list;
//    }
//
//    public void addJobPost(JobPost jobPost) {
//        list.add(jobPost);
//        System.out.println(list);
//    }
//
//    public JobPost getJobPost(int jobPostId) {
//        for (JobPost jobPost : list) {
//            if (jobPostId == jobPost.getPostId()) {
//                return jobPost;
//            }
//        }
//        //not found the post
//        return null;
//    }
//
//    public void updateJobPost(JobPost jobPost) {
//        for (JobPost job : list) {
//            if (job.getPostId() == jobPost.getPostId()) {
//                job.setPostDesc(jobPost.getPostDesc());
//                job.setPostTechStack(jobPost.getPostTechStack());
//                job.setPostProfile(jobPost.getPostProfile());
//                job.setReqExperience(jobPost.getReqExperience());
//            }
//        }
//    }
//
//    public void deleteJobPost(int jobPostId) {
//        /*The java.util.ConcurrentModificationException occurs when you try to modify a collection while iterating over it using an iterator. This exception typically happens when you try to add, remove, or modify elements in a collection while iterating over it using the enhanced for-loop or an iterator's next() method.*/
////        for (JobPost jobPost : list) {
////            if (jobPost.getPostId() == jobPostId) {
////                list.remove(jobPost);
////            }
////        }
//
////        Predicate<JobPost> predicate = jobPost -> (jobPost.getPostId() == jobPostId);
//
//        list.removeIf(jobPost -> jobPost.getPostId() == jobPostId);