import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void pingPong_countUpToGivenNumber_Array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    assertEquals(expected, testPingPong.pingPong(2));
    }

  @Test
  public void pingPong_insertPingWhenDivisibleByThree_Array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    assertEquals(expected, testPingPong.pingPong(3));
    }

  @Test
  public void pingPong_insertPongWhenDivisibleByFive_Array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    expected.add(4);
    expected.add("pong");
    assertEquals(expected, testPingPong.pingPong(5));
    }
  }
