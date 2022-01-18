package homework210;


public class testFan {
    public static void main(String[] args) {
        Fan livingRoomFan = new Fan();
        Fan diningRoomFan = new Fan();

        livingRoomFan.setSpeed(Fan.FAST);
        livingRoomFan.setRadius(10);
        livingRoomFan.setColor("yellow");
        livingRoomFan.turnOn(true);

        diningRoomFan.setSpeed(Fan.MEDIUM);
        diningRoomFan.setRadius(5);
        diningRoomFan.setColor("blue");
        diningRoomFan.turnOn(false);

        System.out.println(livingRoomFan.toString());
        System.out.println(diningRoomFan.toString());
    }

}
