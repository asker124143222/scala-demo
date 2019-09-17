import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xu.dm
 * @Date: 2019/9/17 11:39
 * @Version: 1.0
 * @Description: TODO
 **/
public class Java_Date {
    public static void main(String args[]) throws Exception{
        Date date = getDate("20190101", "yyyyMMdd");
        System.out.println(date);

        date = getDate("20190901");
        System.out.println(date);
    }

    public static Date getDate(String date, String format) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);
    }

    public static Date getDate(String date) throws Exception {
        String format = "yyyyMMdd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);
    }
}
