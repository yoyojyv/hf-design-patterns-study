package observer.sample.afterinterface;

public class ObserverDemoAfter {

    public static void main(String[] args) {
        SensorSystem ss = new SensorSystem();

        AlarmListener b = new Buzzer(ss);
        AlarmListener l = new Lighting(ss);
        AlarmListener c = new CopCall(ss);

        ss.giveTheAlarm("대문", 5); // "대문"쪽에서 센서가 반응하였으며, 경보수준을 5로 정한다.

        ss.removeAlarmListener(b);

        ss.giveTheAlarm("동쪽창문", 3);
    }

}
