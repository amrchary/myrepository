import org.junit.Test;
import static org.junit.Assert.*;

public class TestMessage {

  @Test
  public void testMessageZero() {
    System.out.println("Running testMessageZero"); 
    String msg = Message.getMessage(0);
    assertEquals("Message 0", "Have a nice day!", msg);
  }

  @Test
  public void testMessageOther() {
    System.out.println("Running testMessageOther"); 
    String msg = Message.getMessage(1);
    assertEquals("Message 0", "A wonderful day to you!", msg);
    msg = Message.getMessage(1);
    assertEquals("Message 0", "A wonderful day to you!", msg);
  }
}

