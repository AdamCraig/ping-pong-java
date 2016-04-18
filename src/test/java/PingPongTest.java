import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void pingPong_countUpToGivenNumber_Array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    assertEquals(expected, testPingPong.pingPong(2));
    }
  }
