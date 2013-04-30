package observer.sample.before;

public class Lighting {

    public void alarm(String alarmSourceName, int level) {
        System.out.println(level + "만큼 불들을 킨다.");
        System.out.println(alarmSourceName + "쪽의 불들을 반드시 킨다.");
    }
}
