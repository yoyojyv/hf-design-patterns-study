package observer.sample.afterinterface;

public interface Subject {
    public void registerAlarmListener(AlarmListener o);
    public void removeAlarmListener(AlarmListener o);
    public void notifyAlarmListener();
}
