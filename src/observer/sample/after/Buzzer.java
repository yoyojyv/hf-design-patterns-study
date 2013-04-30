package observer.sample.after;

public class Buzzer implements AlarmListener {

    @Override
    public void alarm(SensorSystem sensorSystem) {
        System.out.println(sensorSystem.getLevel() +  "만큼 경보음을 발생한다.");
        System.out.println(sensorSystem.getAlarmSource() +  "쪽의 경보장치 볼륨을 최대한 높인다.");
    }

}
