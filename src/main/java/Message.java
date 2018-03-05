import java.util.*;

/**
 * Generates a greeting message.
 */
public class Message {

  public static String getMessage(int msgnum) {
    if (msgnum == 0)
      return "Have a nice day!";
    else
      return "A wonderful day to you!"; 
  }
}

