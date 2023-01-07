public class App {
    public static void main(String[] args) throws Exception {

        LightSwitch light = new LightSwitch(false);
        Door door = new Door(false);
        Alexa alexa = new Alexa(light, door);
        alexa.printStatus();
        System.out.println("Turning on light...");
        alexa.setLight(true);
        alexa.printStatus();
        System.out.println("Opening door...");
        alexa.setDoor(true);
        alexa.printStatus();
    }
}
