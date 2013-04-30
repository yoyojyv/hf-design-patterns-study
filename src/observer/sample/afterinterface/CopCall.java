package observer.sample.afterinterface;

public class CopCall implements AlarmListener {

    private SensorSystem sensorSystem;

    public CopCall(SensorSystem sensorSystem){
        this.sensorSystem = sensorSystem;
        sensorSystem.registerAlarmListener(this);
    }

    @Override
    public void alarm() {
        System.out.println(sensorSystem.getAlarmSource() + "쪽에 " + sensorSystem.getLevel() + "만큼 경보발생 경찰에 알린다.");
    }


}
