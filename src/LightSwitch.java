public class LightSwitch {

    private boolean isOn;

    public LightSwitch(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void toggle() {
        isOn = !isOn;
    }
}
