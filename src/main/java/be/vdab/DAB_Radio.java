package be.vdab;

public class DAB_Radio {

    private final String[] BroadCastNames = new String[]{
            "Radio 1",
            "Radio 2",
            "Klara",
            "Stu Bru",
            "MNM",
            "Continue",
            "Sporza",
            "Nieuws+",
            "MNM Hits"
    };
    private boolean status = false;
    private int broadCastNumber = 1;

    public boolean getStatus() {
        return status;
    }

    public void setBroadCastNumbers(int broadCastNumbers) {
        this.broadCastNumber = broadCastNumbers;
    }

    public void on() {
        this.status = true;
    }

    public void off() {
        this.status = false;
    }

    public String getResponse() {
        String response;
        if (!getStatus()) {
            response = "Zet eerst de radio aan!";
        } else if (this.broadCastNumber > 0 && this.broadCastNumber < 10) {
            response = "U luistert naar " + BroadCastNames[this.broadCastNumber-1] +
                    " (zendernummer " + this.broadCastNumber + ")" ;
        } else {
             response = "Geen geldig zendernummer!";
        }
        return response;
    }
}

