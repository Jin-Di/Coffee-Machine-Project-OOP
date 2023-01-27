import java.util.Arrays;

// declare your enum here
enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DayOfWeek.values()));
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}