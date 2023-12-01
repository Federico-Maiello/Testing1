import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OffsetDateTimeExampleTest {

    @Test
    public void testDateFormatting() {
        String dateString = "2002-03-01T13:00:00Z";
        java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);

        String fullFormatExpected = "venerdì 1 marzo 2002";
        String mediumFormatExpected = "1 mar 2002";
        String shortFormatExpected = "01/03/02";

        String fullFormat = OffsetDateTimeExample.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL), offsetDateTime);
        String mediumFormat = OffsetDateTimeExample.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM), offsetDateTime);
        String shortFormat = OffsetDateTimeExample.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT), offsetDateTime);

        assertEquals(fullFormatExpected, fullFormat, "FULL Format does not match");
        assertEquals(mediumFormatExpected, mediumFormat, "MEDIUM Format does not match");
        assertEquals(shortFormatExpected, shortFormat, "SHORT Format does not match");
    }
}
