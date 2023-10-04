public class TemperatureConverter {
      Double toCelsius(Double f){
        Double c ;
        c =  ( 5*(f-32 ) ) /9 ;
        return c;
    }

    Double toFahrenheit(Double c ) {
     //  Double f = c*1.8 + 32  ;
       return c*1.8 + 32 ;
    }

}
