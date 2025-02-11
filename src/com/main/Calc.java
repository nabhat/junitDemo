package com.main;

public class Calc {
    
    public boolean isEven(int n){
        return n%2==0;
    }

    public int factorial(int n){
        int result =1;
        for (int i = 1; i <=n; i++) {
            result=result*i;
        }
        return result;
    }
}
