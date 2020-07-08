package com.example.mathoper;

public class Addition implements MathOpsInterface{
    int addition=0;
    @Override
    public int getResult() {
            return addition;
    }
    public int Addition(String value1, String value2) {
         addition=Integer.parseInt(value1)+Integer.parseInt(value2);
         getResult();
         return addition;
    }

}
