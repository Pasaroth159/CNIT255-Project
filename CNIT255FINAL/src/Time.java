import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author taha
 */
public class Time {
    public String CurrentDate(){
      String timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss ").format(Calendar.getInstance().getTime());
      return(timeStamp);
    }
    
}
