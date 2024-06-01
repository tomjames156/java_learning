package abstraction;

public class MobilePhone extends Phone{

    public MobilePhone(String _model){
        super(_model);
    }
    
    @Override
    public void call(String number){
        System.out.println("Calling " + number + " from " + model);
    }

    public void call(String number, String name){
        System.out.println("Calling " + name + " - " + number + " from " + model);
    }

    @Override
    public void sendMessage(String number, String text){
        System.out.println("Sending text - \"" + text + "\" to " + number + " from " + model);
    }
}
