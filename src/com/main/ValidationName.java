package com.main;

public class ValidationName {
    public boolean validName(String name){
        return name.matches("[A-Z]{1}[a-z]{4,14}");
    }
}
