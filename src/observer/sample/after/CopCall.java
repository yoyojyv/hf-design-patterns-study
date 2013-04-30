package observer.sample.after;

public class CopCall implements AlarmListener {

    @Override
    public void alarm(SensorSystem sensorSystem) {
        System.out.println(sensorSystem.getAlarmSource() + "쪽에 " + sensorSystem.getLevel() + "만큼 경보발생 경찰에 알린다.");
    }

}
