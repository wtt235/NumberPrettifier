package com.NumberPrettifier;

public class Main {

    public static void main(String[] args) throws Exception {
        if(! new PrettyNumber(1000000).toPretty().equals("1M")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(2500000.34).toPretty().equals("2.5M")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(532).toPretty().equals("532")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(1123456789).toPretty().equals("1.1B")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(1654100004564300L).toPretty().equals("1654.1T")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(0).toPretty().equals("0")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(-5).toPretty().equals("-5")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(-0.25).toPretty().equals("-0.25")){
            throw new Exception("Failed");
        }
        if(! new PrettyNumber(1999999.999999).toPretty().equals("1.9M")){
            throw new Exception("Failed");
        }
        System.out.println("All tests passed!");
    }
}
