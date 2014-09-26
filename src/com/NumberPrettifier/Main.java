package com.NumberPrettifier;

public class Main {

    public static void main(String[] args) throws Exception {
        if(! new PrettyNumber(1000000).toString().equals("1M")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(2500000.34).toString().equals("2.5M")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(532).toString().equals("532")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(532000000).toString().equals("532M")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(1123456789).toString().equals("1.1B")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(1654100004564300L).toString().equals("1654.1T")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(0).toString().equals("0")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(999999).toString().equals("999999")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(-5).toString().equals("-5")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(-0.25).toString().equals("-0.25")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(1999999.999999).toString().equals("1.9M")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(Float.MIN_VALUE).toString().equals(Float.MIN_VALUE + "")){
            throw new Exception("Failed");
        }
        System.out.println("All tests passed!");
    }
}
