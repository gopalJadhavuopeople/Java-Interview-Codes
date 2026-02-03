import java.time.LocalTime;

public class test {

    public static void main(String[] args) {
        // Shift details
        LocalTime shiftStart = LocalTime.of(9, 0);
        LocalTime shiftEnd = LocalTime.of(18, 0);
        int bufferMinutes = 60;

        // Employee in-time (example)
        LocalTime employeeInTime = LocalTime.of(8, 39);

        // Calculate valid in-time range
        LocalTime earliestInTime = shiftStart.minusMinutes(bufferMinutes);
        LocalTime latestInTime = shiftStart.plusMinutes(bufferMinutes);

        //Calculate valid outitme range
        LocalTime earliestLogoutTime=shiftEnd.minusMinutes(bufferMinutes);
        LocalTime latestLogoutTime=shiftEnd.plusMinutes(bufferMinutes);

        LocalTime employeeOutTime=LocalTime.of(18,55);

        if(!employeeOutTime.isBefore(earliestLogoutTime) && !employeeOutTime.isAfter(latestLogoutTime))
        {
            System.out.println("valid logout time");
        }
        else
        {
            System.out.println("Invalid logout time");
        }

        // Check if entry is valid
        if (!employeeInTime.isBefore(earliestInTime) && !employeeInTime.isAfter(latestInTime)) {
            System.out.println("Valid entry");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
