package com.strutslearning.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    private String message;

    @Override
    public String execute() {
        message = "Struts 2 is working in a real project structure!";
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }
}