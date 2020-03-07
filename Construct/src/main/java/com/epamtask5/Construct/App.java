package com.epamtask5.Construct;
import java.util.*;
import  org.apache.log4j.*;

class StandardMaterial{
public double cost(double area){
double cost = area * 1200;
return cost;
}
}
class AboveStandardMaterial{
public double cost(double area){
double cost = area * 1500;
return cost;
}
}
class HighStandardMaterial{
public double cost(double area){
double cost = area * 1800;
return cost;
}
}
class HighStandardMaterialAndAutomation{
public double cost(double area){
double cost = area * 2500;
return cost;
}
}
