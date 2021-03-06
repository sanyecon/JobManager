package com.sport.jobmanager.dao;

import com.sport.jobmanager.common.JobStatus;
import com.sport.jobmanager.common.domain.Job;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Lukas Kubicek
 */
public interface JobManagerDao {

    /**
     * this will load jobs in specific status
     */
    List<Job> getJobs(JobStatus status);

    List<Job> getJobsReadyForProcessing(String agentName);

    List<Job> getJobsToCleanUp(Timestamp cleanDate);

    void removeJob(Job job);
}
