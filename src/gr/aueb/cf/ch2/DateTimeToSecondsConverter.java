package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει ημέρες, ώρες, λεπτά, δεθτερόλεπτα,
 * σε συνολικά δεθτερόλεπτα. Ο χρήστης δηλώνει τα
 * δεδομένα και εκτυπώνεται το τελικό αποτέλεσματα
 */

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {

        // Αρχικοποίηση μεταβλητών
        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        Scanner in = new Scanner(System.in);
        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputeSeconds;
        int totalSeconds = 0;

        System.out.println("Please insert days, hours, minutes, seconds");
         inputDays= in.nextInt();
         inputHours = in.nextInt();
         inputMinutes = in.nextInt();
         inputeSeconds = in.nextInt();

         totalSeconds = inputDays * SECONDS_PER_DAY + inputHours * SECONDS_PER_HOUR
                 + inputMinutes * SECONDS_PER_MINUTE +inputeSeconds;

         System.out.printf(Locale.US, "Total seconds: %,d seconds \n", totalSeconds);
    }
}
