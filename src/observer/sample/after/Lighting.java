package observer.sample.after;

public class Lighting implements AlarmListener {

    @Override
    public void alarm(SensorSystem sensorSystem) {
        System.out.println(sensorSystem.getLevel() + "만큼 불들을 킨다.");
        System.out.println(sensorSystem.getAlarmSource() + "쪽의 불들을 반드시 킨다.");
    }
}
