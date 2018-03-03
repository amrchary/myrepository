import java.util.*;

public class Message {

  private static int count = 0;

  public static String getMessage() {
    if (count++ % 2 == 0)
      return "Have a nice day!";
    else
      return "A wonderful day to you!"; 
  }
}

