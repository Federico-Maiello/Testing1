import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OffsetDateTimeExampleTest {
    OffsetDateTimeExample offsetDateTimeExample = new OffsetDateTimeExample();
    String dateString = "2002-03-01T13:00:00Z";
    java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);
    @Test
    void formatFull() {
        String risultato = offsetDateTimeExample.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL), offsetDateTime);
        Assert.assertEquals("venerdì 1 marzo 2002", risultato);
    }
    @Test
    void formatMedium() {
        String risultato = offsetDateTimeExample.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM), offsetDateTime);
        Assert.assertEquals("1 mar 2002", risultato);
    }
    @Test
    void formatShort() {
        String risultato = offsetDateTimeExample.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT), offsetDateTime);
        Assert.assertEquals("01/03/02", risultato);
    }
}
