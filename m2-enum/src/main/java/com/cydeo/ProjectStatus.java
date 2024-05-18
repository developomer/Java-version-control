package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN_PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() {
    }
}
