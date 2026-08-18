package anand.util.date;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemoSO {
  public static void main(String args[]) {
    int style = DateFormat.FULL;
    //Also try with style = DateFormat.FULL and DateFormat.SHORT
    Date date = new Date();
    DateFormat df;
    df = DateFormat.getDateInstance(style, Locale.UK);
    System.out.println("United Kingdom: " + df.format(date));
    df = DateFormat.getDateInstance(style, Locale.US);
    System.out.println("USA: " + df.format(date));   
    df = DateFormat.getDateInstance(style, Locale.FRANCE);
    System.out.println("France: " + df.format(date));
    df = DateFormat.getDateInstance(style, Locale.ITALY);
    System.out.println("Italy: " + df.format(date));
    df = DateFormat.getDateInstance(style, Locale.JAPAN);
    System.out.println("Japan: " + df.format(date));
  }
}
