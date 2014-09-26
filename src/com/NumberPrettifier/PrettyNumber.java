package com.NumberPrettifier;
import java.lang.Number;

public class PrettyNumber{

    private Number number;

    public PrettyNumber(Number numb){
        this.number = numb;
    }

    public String toPretty(){
        if(this.number.intValue() <= 0){
            return this.number.toString();
        }
        String[] names = {"","","M","B","T"};
        int digits = (int)Math.floor(Math.log10(this.number.longValue()));
        int nameIndex = Math.min(digits/3, names.length-1);
        if(names[nameIndex].equals("")){
            return this.number.toString();
        }
        // get the left most digit
        long firstFigure = (long)(this.number.longValue()/(Math.pow(10,(nameIndex * 3))));
        // subtract the value of the left most digit from the number
        long temp = (long)(this.number.longValue() - (firstFigure * Math.pow(10,nameIndex * 3)));
        // get the new left most digit (the second left most from the original number)
        long secondFigure = (long)(temp / Math.pow(10,((nameIndex * 3) -1)));
        String result = firstFigure + "";
        if(secondFigure > 0){
            result += "." + secondFigure;
        }
        result += names[nameIndex];
        return result;
    }
}
