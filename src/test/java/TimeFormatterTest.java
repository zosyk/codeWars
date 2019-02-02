import org.junit.Test;
import static org.junit.Assert.*;

public class TimeFormatterTest {
    @Test
    public void testFormatDurationExamples() {
        // Example Test Cases
        assertEquals("now", TimeFormatter.formatDuration(0));
        assertEquals("1 year", TimeFormatter.formatDuration(TimeFormatter.ONE_YEAR));
        assertEquals("2 years", TimeFormatter.formatDuration(TimeFormatter.ONE_YEAR * 2));
        assertEquals("2 years and 1 day", TimeFormatter.formatDuration(TimeFormatter.ONE_YEAR * 2 + TimeFormatter.ONE_DAY));
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }
}
