public class LivingRoomLight extends LightSwitch {
    private int lightPercentage;

    public LivingRoomLight(boolean isOn, int lightPercentage) {
        super(isOn);
        this.lightPercentage = lightPercentage;
    }

    public int getLightPercentage() {
        return lightPercentage;
    }

    public void setLightPercentage(int lightPercentage) {
        this.lightPercentage = lightPercentage;
    }

    @Override
    public void setOn(boolean on) {

        // call inherited method
        super.setOn(true);
        lightPercentage = 100;
    }
}