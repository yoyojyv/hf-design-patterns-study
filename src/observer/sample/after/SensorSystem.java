package observer.sample.after;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem {

    private String alarmSource;
    private int level = 0; // 경보 수준
    private List<AlarmListener> listeners = new ArrayList<AlarmListener>();

    public void register(AlarmListener al) {
        listeners.add(al);
    }

    public void giveTheAlarm(String alarmSource, int level) {
        this.alarmSource = alarmSource;
        this.level = level;

        notifyObservers();
    }

    public void notifyObservers() {
        for (AlarmListener al : listeners) {
            al.alarm(this);
        }
    }

    public int getLevel() {
        return level;
    }

    public String getAlarmSource() {
        return  alarmSource;
    }

}
