package observer.sample.afterinterface;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem implements Subject {

    private String alarmSource;
    private int level = 0; // 경보 수준
    private List<AlarmListener> listeners;

    public SensorSystem() {
        listeners = new ArrayList<AlarmListener>();
    }

    public void registerAlarmListener(AlarmListener al) {
        listeners.add(al);
    }

    public void removeAlarmListener(AlarmListener al) {
        listeners.remove(al);
    }

    public void notifyAlarmListener() {
        for (AlarmListener al : listeners) {
            al.alarm();
        }
    }

    public void giveTheAlarm(String alarmSource, int level) {
        this.alarmSource = alarmSource;
        this.level = level;
        notifyAlarmListener();
    }

    public int getLevel() {
        return level;
    }

    public String getAlarmSource() {
        return alarmSource;
    }

}
