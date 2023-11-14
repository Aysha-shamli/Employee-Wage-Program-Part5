package EmployyeWage;
import java.util.Random;

public class Attendance {
    public static void checkAttendance(String employeeName) {
        Random random = new Random();
        int attendance = random.nextInt(2);

        if (attendance == 1) {
            System.out.println(employeeName + " is Present");
        } else {
            System.out.println(employeeName + " is Absent");
        }
    }
}

