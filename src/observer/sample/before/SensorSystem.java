package observer.sample.before;

public class SensorSystem {

    Lighting lighting;
    Buzzer buzzer;

    public SensorSystem() {
        lighting = new Lighting();
        buzzer = new Buzzer();
    }

    public void giveTheAlarm(String alarmSourceName, int level) {
        lighting.alarm(alarmSourceName, level);
        buzzer.alarm(alarmSourceName, level);
    }

}
