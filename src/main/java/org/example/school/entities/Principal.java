package org.example.school.entities;

public class Principal extends Staff{
    private String reportingLines;

    @Override
    public String toString() {
        return "Principal{" +
                "reportingLines='" + reportingLines + '\'' +
                '}';
    }

    public String getReportingLines() {
        return reportingLines;
    }

    public void setReportingLines(String reportingLines) {
        this.reportingLines = reportingLines;
    }

    public Principal(String reportingLines) {
        this.reportingLines = reportingLines;
    }
}
