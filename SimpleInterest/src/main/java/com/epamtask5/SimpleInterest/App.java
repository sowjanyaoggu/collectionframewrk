package com.epamtask5.SimpleInterest;

import java.util.*;
import  org.apache.log4j.*;

class SimpleInterest{
public double calculate(double principle,double time, double rate) {
double simpleinterest = (principle * time * rate)/100;
return simpleinterest;
}
}

class CompoundInterest {
public double calculate(double principle, double time, double rate) {
    double amount = principle * (Math.pow((1 + rate / 100), time));
    double compoundinterest = amount - principle;
    return compoundinterest;
   }
}

