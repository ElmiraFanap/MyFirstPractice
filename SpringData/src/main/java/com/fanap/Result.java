package com.fanap;

import java.util.List;

public class Result<T> {

    public Result(int messageCode, String message, List<T> lstResult) {
        this.messageCode = messageCode;
        this.message = message;
        this.lstResult = lstResult;
    }

    private int messageCode;

    private String message;

    private List<T> lstResult;

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getLstResult() {
        return lstResult;
    }

    public void setLstResult(List<T> lstResult) {
        this.lstResult = lstResult;
    }
}
