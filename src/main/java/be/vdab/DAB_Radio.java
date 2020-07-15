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
    private boolean status;
    private int broadCastNumber;

    public boolean isStatus() {
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
        if (this.status = false) {
            response = "Zet eerst de radio aan!";
        } else if (this.broadCastNumber < 1 && this.broadCastNumber > 9) {
            response = "Geen geldig zendernummer!";
        } else {
            response = "U luistert naar" + BroadCastNames[this.broadCastNumber - 1];
        }
        return response;
    }
}

