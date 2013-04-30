package observer.sample.afterinterface;

public class Buzzer implements AlarmListener {

    private SensorSystem sensorSystem;

    public Buzzer(SensorSystem sensorSystem){
        this.sensorSystem = sensorSystem;
        sensorSystem.registerAlarmListener(this);
    }

    @Override
    public void alarm() {
        System.out.println(sensorSystem.getLevel() +  "만큼 경보음을 발생한다.");
        System.out.println(sensorSystem.getLevel() +  "쪽의 경보장치 볼륨을 최대한 높인다.");
    }

}
