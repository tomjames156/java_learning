package abstraction;

public abstract class Phone {
    String model;

    public Phone(String _model){
        model = _model;
    }

    abstract void call(String number);

    abstract void sendMessage(String message, String number);

    public final String getModel(){
        return model;
    }
}
