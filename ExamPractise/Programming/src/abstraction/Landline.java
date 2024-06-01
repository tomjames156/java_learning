package abstraction;

public class Landline extends Phone{

    public Landline(String _model){
        super(_model);
    }
    
    @Override
    public void call(String number){
        System.out.println("Calling " + number + " from " + model);
    }

    @Override
    public void sendMessage(String number, String text){
        System.out.println("Device cannot send messages");
    }
}
