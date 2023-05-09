package com.addodevelop.SpringRest.rest;

public class StudentErrorResponse {

    private Integer status;
    private String message;
    private Long TimeStamp;

    public StudentErrorResponse() {}

    public StudentErrorResponse(Integer status, String message, Long timeStamp) {
        this.status = status;
        this.message = message;
        TimeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        TimeStamp = timeStamp;
    }
}
