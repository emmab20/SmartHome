public class Alexa {

    // Private fields
    private LightSwitch lightSwitch;
    private Door door;

    // Constructor that takes a LightSwitch and Door
    public Alexa(LightSwitch lightSwitch, Door door) {
        this.lightSwitch = lightSwitch;
        this.door = door;
    }

    // Returns the lightswitch
    public LightSwitch getLightSwitch() {
        return lightSwitch;
    }

    // Gets the door
    public Door getDoor() {
        return door;
    }

    // Turn on the light
    public void setLight(boolean on) {
        lightSwitch.setOn(on);
    }

    // Open the door
    public void setDoor(boolean open) {
        door.setOpen(open);
    }

    public void printStatus() {

        String status = "off";
        if (lightSwitch.isOn())
            status = "on";
        System.out.println("Light is " + status);

        status = "closed";
        if (door.isOpen())
            status = "open";
        System.out.println("Door is " + status);
    }
}
