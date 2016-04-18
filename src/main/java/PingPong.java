import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public ArrayList<Object> pingPong(Integer number) {
    ArrayList<Object> countingUp = new ArrayList<Object>();
    for (Integer index = 1 ; index <= number ; index++) {
      if (index % 15 == 0) {
        countingUp.add("pingpong");
      } else if (index % 3 == 0) {
        countingUp.add("ping");
      } else if (index % 5 == 0) {
        countingUp.add("pong");
      } else {
        countingUp.add(index);
      }
    } return countingUp;
  }

}
