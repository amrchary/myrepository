import java.util.*;

/**
 * Generates a greeting message.
 */
public class Message {

  public static String getMessage() {
    int rn = (int) Math.floor(Math.random() * 101);
    if (rn % 2 == 0)
      return "Have a nice day!";
    else
      return "A wonderful day to you!"; 
  }
}

