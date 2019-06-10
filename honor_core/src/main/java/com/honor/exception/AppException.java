package com.honor.exception;

public class AppException extends Exception {

    public AppException(){
        super();
    }

    public AppException(String msg, Exception e) {
        super(msg,e);
    }
}
