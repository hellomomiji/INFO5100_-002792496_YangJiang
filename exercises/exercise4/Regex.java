import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex
 */
public class Regex {

  public static void main(String[] args) {
    // Pattern 1 for matching email address
    Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
    String validEmail = "john.doe@example.com";
    String invalidEmail = "johndoe@examplecom";

    // Pattern 2 for matching US phone number
    Pattern phonePattern = Pattern.compile("\\b\\d{3}-\\d{3}-\\d{4}\\b");
    String validPhone = "408-123-4567";
    String invalidPhone = "4081234567";

    // Pattern 3 for matching hexadecimal color code
    Pattern colorPattern = Pattern.compile("#[A-Fa-f0-9]{6}");
    String validColor = "#FFFFFF";
    String invalidColor = "#GGGGGG";

    // Pattern 4 for matching US currency format
    Pattern currencyPattern = Pattern.compile("\\$\\d+(\\.\\d{2})?");
    String validCurrency = "$10.99";
    String invalidCurrency = "10.99";

    // Pattern 5 for matching date in numeric format, such as 2003-08-06
    Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    String validDate = "2023-03-28";
    String invalidDate = "2023/3/28";


    // Test pattern 1 email address
    System.out.println("Pattern 1: email address");
    Matcher emailMatcher = emailPattern.matcher(validEmail);
    System.out.println("  Valid email address match: " + emailMatcher.matches());
    emailMatcher = emailPattern.matcher(invalidEmail);
    System.out.println("  Invalid email address match: " + emailMatcher.matches());

    // Test pattern 2 us phone number
    System.out.println("Pattern 2: us phone nnumber");
    Matcher phoneMatcher = phonePattern.matcher(validPhone);
    System.out.println("  Valid phone number match: " + phoneMatcher.matches());
    phoneMatcher = phonePattern.matcher(invalidPhone);
    System.out.println("  Invalid phone number match: " + phoneMatcher.matches());

    // Test pattern 3 hexadecimal color code
    System.out.println("Pattern 3: hexadecimal color code");
    Matcher colorMatcher = colorPattern.matcher(validColor);
    System.out.println("  Valid color code match: " + colorMatcher.matches());
    colorMatcher = colorPattern.matcher(invalidColor);
    System.out.println("  Invalid color code match: " + colorMatcher.matches());

    // Test pattern 4 us currency format
    System.out.println("Pattern 4: us currency");
    Matcher currencyMatcher = currencyPattern.matcher(validCurrency);
    System.out.println("  Valid currency format match: " + currencyMatcher.matches());
    currencyMatcher = currencyPattern.matcher(invalidCurrency);
    System.out.println("  Invalid currency format match: " + currencyMatcher.matches());

    // Test pattern 5 date format
    System.out.println("Pattern 5: date format");
    Matcher dateMatcher = datePattern.matcher(validDate);
    System.out.println("  Valid date format match: " + dateMatcher.matches());
    dateMatcher = datePattern.matcher(invalidDate);
    System.out.println("  Invalid datee format match: " + dateMatcher.matches());
  }
}