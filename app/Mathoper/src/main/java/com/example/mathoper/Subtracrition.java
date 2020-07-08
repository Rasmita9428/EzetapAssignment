package com.example.mathoper;

public class Subtracrition implements MathOpsInterface{
int sub;
    public int Subtracrition(String value1, String value2) {
         sub=Integer.parseInt(value1)-Integer.parseInt(value2);
         getResult();
         return sub;
    }
    @Override
    public int getResult() {
        return sub;
    }

}

