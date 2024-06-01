package running;

public class Temperature {
    float value;

    public Temperature(float _value){
        value = _value;
    }

    public float toFarenheit(){
        return (value * (9 / 5)) + 32;
    }

    public float toCelsius(){
        return (value - 32) * 5 / 9;
    }

}
