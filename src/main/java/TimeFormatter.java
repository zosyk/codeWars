import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimeFormatter {

    final static int ONE_MIN = 60;
    final static int ONE_HOUR = 60 * ONE_MIN;
    final static int ONE_DAY = 24 * ONE_HOUR;
    final static int ONE_YEAR = 365 * ONE_DAY;

    public static String formatDuration(int seconds) {
        if (seconds == 0)
            return "now";

        String years = formatTime(seconds, ONE_YEAR, "year");
        String days = formatTime(seconds = seconds % ONE_YEAR, ONE_DAY, "day");
        String hours = formatTime(seconds = seconds % ONE_DAY, ONE_HOUR, "hour");
        String minutes = formatTime(seconds = seconds % ONE_HOUR, ONE_MIN, "minute");
        String secondsLeft = formatTime(seconds % ONE_MIN, 1, "second");

        return addDelimiters(years, days, hours, minutes, secondsLeft);
    }

    private static String addDelimiters(String... durations) {
        String result = Stream.of(durations)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(", "));

        int lastCommaIndex = result.lastIndexOf(",");
        if (lastCommaIndex != -1)
            result = result.substring(0, lastCommaIndex) + " and" + result.substring(lastCommaIndex + 1);
        return result;
    }

    private static String formatTime(int seconds, int timeUnit, String unitName) {
        int timeUnits = seconds / timeUnit;
        if (timeUnits > 0)
            return timeUnits + " " + unitName + (timeUnits == 1 ? "" : "s");
        else
            return "";
    }
}