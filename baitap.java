package auto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class baitap {
public static void main(String[] args) {
  DateFormat sDateFormat = new SimpleDateFormat("yyyyMMdd");
  Scanner sc = new Scanner(System.in);
  System.out.print("Nhap Start date(yyyyMMdd): ");
  String nam = sc.nextLine();
  System.out.print("Nhap Close date(yyyyMMdd): ");
  String nam1 = sc.nextLine();
  System.out.print("Nhap so thang cong them: ");
  int st = sc.nextInt();
  
  Date currentDate = new Date();
  Date date1 = null;
  Date date2 = null;
  try {
   String startDate = nam;
   String closeDate = nam1;
   date1 = sDateFormat.parse(startDate);
   date2 = sDateFormat.parse(closeDate);
   long getDiff = date2.getTime() - date1.getTime();
   
   long getMonth = date2.getMonth() - date1.getMonth();
   long getDays = getDiff / (24 * 60 * 60 * 1000);
   System.out.println("Khoang cach tu: " + startDate + " den " + closeDate + " la " + getDays + " ngay.");
   System.out.println("Khoang cach tu: " + startDate + " den " + closeDate + " la " + getMonth + " thang.");
   
   Calendar cal = Calendar.getInstance();
   cal.setTime(date1);
   cal.add(Calendar.MONTH, st);
   cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
   //Date st1 = cal.getTime();

   System.out.println("Start date = " + startDate +  "\nSo thang cong them la: " + st + "\n= " + sDateFormat.format(cal.getTime()));
   } catch (Exception e) {
   e.printStackTrace();
   }
 }

}
