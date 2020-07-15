package be.vdab;

public class DemoRadio {

    public static void main(String[] args) {
        String response;
        DAB_Radio radio = new DAB_Radio();
        response = radio.getResponse();
        System.out.println(response);
        radio.on();
        response = radio.getResponse();
        System.out.println(response);
        radio.setBroadCastNumbers(10);
        response = radio.getResponse();
        System.out.println(response);
        radio.setBroadCastNumbers(0);
        response = radio.getResponse();
        System.out.println(response);
        radio.setBroadCastNumbers(5);
        response = radio.getResponse();
        System.out.println(response);
        radio.off();
        System.out.println("De radio is "+ (radio.getStatus() ? "aan" : "uit"));
    }
}


