package org.example.school.entities;

public class NonAcademicStaffs extends Staff{
    private String jobTittle;

    @Override
    public String toString() {
        return "NonAcademicStaffs{" +
                "jobTittle='" + jobTittle + '\'' +
                '}';
    }

    public String getJobTittle() {
        return jobTittle;
    }

    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }

    public NonAcademicStaffs(String jobTittle) {
        this.jobTittle = jobTittle;
    }
}
