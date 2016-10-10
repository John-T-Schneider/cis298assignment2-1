package edu.kvcc.cis298.cis298assignment2;


public class UnitConverter {
    //Celsius Conversions
    public static double CtoC(double cel){
        return cel;
    }
    public static double CtoF(double cel){
        double fah=(cel*1.8)+32;
        return fah;
    }
    public static double CtoK(double cel){
        double kel=cel+273.15;
        return kel;
    }
    public static double CtoR(double cel){
        double ran=(cel+273.15)*1.8;
        return ran;
    }
    //Fahrenheit Conversions
    public static double FtoC(double fah){
        double cel=(fah-32)/1.8;
        return cel;
    }
    public static double FtoF(double fah){
        return fah;
    }
    public static double FtoK(double fah){
        double kel=(fah+459.67)/1.8;
        return kel;
    }
    public static double FtoR(double fah){
        double ran=fah+459.67;
        return ran;
    }
    //Kelvin Conversions
    public static double KtoC(double kel){
        double cel=kel-273.15;
        return cel;
    }
    public static double KtoF(double kel){
        double fah=(kel*1.8)-459.67;
        return fah;
    }
    public static double KtoK(double kel){
        return kel;
    }
    public static double KtoR(double kel){
        double ran=kel*1.8;
        return ran;
    }
    //Rankin Conversions
    public static double RtoC(double ran){
        double cel=(ran/1.8)-273.15;
        return cel;
    }
    public static double RtoF(double ran){
        double fah=ran-459.67;
        return fah;
    }
    public static double RtoK(double ran){
        double kel=ran/1.8;
        return kel;
    }
    public static double RtoR(double ran){
        return ran;
    }











}
