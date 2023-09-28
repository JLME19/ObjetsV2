/** Une classe qui définit un objet simple */
public class HdmiPort {

    // attributs
    boolean functioning  = true;
    String connectedTo = "None";


    // comportements
    public void damage() {
        functioning = false;
    }
    public void repair() {
        functioning = true;
    }

    public void connect(String device) {
        connectedTo = device;
    }
    public void disconnect() {
        connectedTo = "None";
    }
}
