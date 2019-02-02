public class TimeFormatter {

    final static int ONE_MIN = 60;
    final static int ONE_HOUR = 60 * ONE_MIN;
    final static int ONE_DAY = 24 * ONE_HOUR;
    final static int ONE_YEAR = 365 * ONE_DAY;

    public static String formatDuration(int s) {
        if (s == 0)
            return "now";

        String years = formatTime(s / ONE_YEAR, "year");
        String days = formatTime((s = s % ONE_YEAR) / ONE_DAY, "day");
        String hours = formatTime((s = s % ONE_DAY) / ONE_HOUR, "hour");
        String minutes = formatTime((s = s % ONE_HOUR) / ONE_MIN, "minute");
        String secondsLeft = formatTime(s % ONE_MIN, "second");

        String result = years + days + hours + minutes + secondsLeft;
        result = result.substring(0, result.length() - 2);
        result = result.replaceAll("(.*), (.*)$", "$1 and $2");

        return result;
    }

    private static String formatTime(int n, String unitName) {
        if (n > 0)
            return String.format("%s %s%s, ", n, unitName, (n == 1 ? "" : "s"));
        else
            return "";
    }
}