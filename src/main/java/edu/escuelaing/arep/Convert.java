package edu.escuelaing.arep;

public class Convert {

    public Convert () {
    }
    public  String celToFa(Float cantidad){
        Float fahrenheit = cantidad*9/5 +32 ;
        String symbol = "°F";
        return "El resultado es: " + Float.toString(fahrenheit)+symbol;
    }
    public  String faToCel(Float cantidad){
        float celcius = (cantidad*5 -160)/9;
        String symbol ="°C";
        return "El resultado es: " + Float.toString(celcius)+symbol;
    }


}
