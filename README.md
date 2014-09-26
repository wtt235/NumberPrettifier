Number Prettifer
=================================================

Approach
-------------
An object oriented approach was taken.  A class to handle the conversion of a numeric type to a "pretty" type.  
To test the validity of this conversion, some simple checks are done within the project's main method.


Assumptions
-------------
- There is no rounding.  Decimal values are ignored.
- Any (positive or negative) number 999999 or less will return unmodified. 


Design
-------------
The main class of concern is PrettyNumber, with a constructor that will accept
any argument of type *Number*, which is the parent of a variety of numeric types like *Double, Float, Integer, Long, Short*.
The work of prettifing a number is handled by the method, *toPretty()*.
The most important mathematical concept at work is the [common logarithm](https://en.wikipedia.org/wiki/Common_logarithm).
This allows us to calculate the number of digits in a number, which can be used to extract specific digits. We can map 
the digits to a place value name by dividing the digits by 3.

Example Usage
-------------
```java
PrettyNumber x = new PrettyNumber(2500000.34);
String xPretty = x.toPretty(); // xPretty now holds "2.5M"
```
More examples can be found in the project's main method.