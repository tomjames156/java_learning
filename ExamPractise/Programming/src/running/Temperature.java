package running;

import java.util.*;

public class Temperature {
    float value;

    public Temperature(float _value){
        value = _value;
    }

    public float convert(){
        float result;
        char conversionTemp;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What temperature would you like to convert to?\nEnter 'F' for Farenheit and 'C' for Celsius\n=> : ");
        conversionTemp = myScanner.nextLine().charAt(0);
        myScanner.close();

        if(conversionTemp == 'F'){
            result = this.toFarenheit();
            return result;
        }else if(conversionTemp == 'C'){
            result = this.toCelsius();
            return result;
        }else{
            System.out.println("Invalid temperature conversion type");
            return value;
        }
    }

    public float toFarenheit(){
        return (value * 9 / 5) + 32;
    }

    public float toCelsius(){
        return (value - 32) * 5 / 9;
    }

}
