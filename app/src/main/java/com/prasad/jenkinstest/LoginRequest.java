package com.prasad.jenkinstest;

/**
 * Created by prrathin on 8/1/16.
 */
public class LoginRequest {
    String userName;
    public LoginRequest(){

    }
    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }
}
