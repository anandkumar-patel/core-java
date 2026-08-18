package anand.logical;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

  public static void main(String[] args) throws ParseException {
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    DateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
    String date1 = "07-04-2019";
    Date grnDate = null;
    if (date1.trim().matches("\\d{2}-\\d{2}-\\d{4}")) {
      grnDate = dateFormat1.parse(date1);
    } else {
      System.out.println("date time");
      grnDate = dateFormat.parse(date1);
    }

    System.out.println("Date time :" + grnDate);
  }

}
