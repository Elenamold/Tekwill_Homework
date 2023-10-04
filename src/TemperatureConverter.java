public class TemperatureConverter {
   Double t;
    Double toCelsius(Double f){
        Double c ;
        c= (Double) ( 5*(f-32 ) ) /9 ;
        return c;
    }

    Double toFahrenheit(Double c ) {
       Double f = c*1.8 + 32  ;
       return f ;
    }

}
