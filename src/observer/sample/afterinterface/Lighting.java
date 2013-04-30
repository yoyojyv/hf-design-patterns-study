package observer.sample.afterinterface;

public class Lighting implements AlarmListener {

    private SensorSystem sensorSystem;

    public Lighting(SensorSystem sensorSystem){
        this.sensorSystem = sensorSystem;
        sensorSystem.registerAlarmListener(this);
    }

    @Override
    public void alarm() {
        System.out.println(sensorSystem.getLevel() + "만큼 불들을 킨다.");
        System.out.println(sensorSystem.getAlarmSource() + "쪽의 불들을 반드시 킨다.");
    }

}
