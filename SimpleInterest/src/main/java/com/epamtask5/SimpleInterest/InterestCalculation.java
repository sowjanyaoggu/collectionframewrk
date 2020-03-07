package com.epamtask5.SimpleInterest;

public class InterestCalculation {

public static void main(String[] args) {
// TODO Auto-generated method stub
final Logger logger = Logger.getLogger(InterestCalculation.class);
double simple,compound;
double principle,time,rate;
Scanner sc = new Scanner(System.in);
logger.info("Enter principle time and rate");
principle = sc.nextDouble();
time = sc.nextDouble();
rate = sc.nextDouble();

SimpleInterest simpleinterest = new SimpleInterest();
simple = simpleinterest.calculate(principle,time,rate);

CompoundInterest compoundinterest = new CompoundInterest();
compound = compoundinterest.calculate(principle,time,rate);

logger.info("Simple Interest is "+simple);
logger.info("Compound Interest is "+compound);
sc.close();
}

}