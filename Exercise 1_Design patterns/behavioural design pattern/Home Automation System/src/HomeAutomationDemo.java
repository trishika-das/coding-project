// HomeAutomationDemo.java
public class HomeAutomationDemo {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command turnOffLight = new TurnOffLightCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnLight);
        remote.pressButton();

        remote.setCommand(turnOffLight);
        remote.pressButton();
    }
}
