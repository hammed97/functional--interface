package org.example.school.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Applicants extends Students{
    private int applicantId;
    private String appliedClass;
    private String admissionStatus;
    private BigDecimal applicationFee;
    private LocalDate applicationDate;



//    public Applicants(int applicantId, String appliedClass, String admissionStatus, BigDecimal applicationFee, LocalDate applicationDate) {
//        this.applicantId = applicantId;
//        this.appliedClass = appliedClass;
//        this.admissionStatus = admissionStatus;
//        this.applicationFee = applicationFee;
//        this.applicationDate = applicationDate;
//    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getAppliedClass() {
        return appliedClass;
    }

    public void setAppliedClass(String appliedClass) {
        this.appliedClass = appliedClass;
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    public BigDecimal getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(BigDecimal applicationFee) {
        this.applicationFee = applicationFee;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    @Override
    public String toString() {
        return "Applicants{" +
                "applicantId=" + applicantId +
                ", appliedClass='" + appliedClass + '\'' +
                ", admissionStatus='" + admissionStatus + '\'' +
                ", applicationFee=" + applicationFee +
                ", applicationDate=" + applicationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicants that = (Applicants) o;
        return applicantId == that.applicantId && Objects.equals(appliedClass, that.appliedClass) && Objects.equals(admissionStatus, that.admissionStatus) && Objects.equals(applicationFee, that.applicationFee) && Objects.equals(applicationDate, that.applicationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicantId, appliedClass, admissionStatus, applicationFee, applicationDate);
    }
}
