/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webserverlenin;

public class ProjectDTO {
    private String clientName;
    private String jobCode;
    private String status;
    private String dateIssued;
    private String dateConfirmed;
    private int runningDays;
    private String warranty;

    // Getters and Setters
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getDateConfirmed() {
        return dateConfirmed;
    }

    public void setDateConfirmed(String dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public int getRunningDays() {
        return runningDays;
    }

    public void setRunningDays(int runningDays) {
        this.runningDays = runningDays;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
}

