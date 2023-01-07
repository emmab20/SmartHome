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

        LivingRoomLight livingRoomLight = new LivingRoomLight(false, 0);
        livingRoomLight.getLightPercentage();
        System.out.println("Turning on living room light...");
        livingRoomLight.setOn(true);
        System.out.println("Living room light brightness is: " + livingRoomLight.getLightPercentage());
        System.out.println("Setting living room light to 50%...");
        livingRoomLight.setLightPercentage(50);
        System.out.println("Living room light brightness is: " + livingRoomLight.getLightPercentage());
    }
}
