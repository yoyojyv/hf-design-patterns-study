package observer.sample.before;

public class ObserverDemoBefore {
    public static void main(String[] args) {
        SensorSystem ss = new SensorSystem();

        ss.giveTheAlarm("대문", 5); // "대문"에서 5 수준의 경보가 발생
    }
}
