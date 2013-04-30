package observer.sample.before;

public class Buzzer {
    public void alarm( String alarmSourceName, int level) {
        System.out.println(level + "만큼 경보음을 발생한다.");
        System.out.println(alarmSourceName + "쪽의 경보장치 볼륨을 최대한 높인다.");
    }
}
