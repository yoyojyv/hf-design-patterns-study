package observer.sample.after;

public class ObserverDemoAfter {

    public static void main(String[] args) {
        SensorSystem ss = new SensorSystem();

        ss.register(new Buzzer());
        ss.register(new Lighting());
        ss.register(new CopCall());

        ss.giveTheAlarm("대문", 5); // "대문"쪽에서 센서가 반응하였으며, 경보수준을 5로 정한다.
    }

}
