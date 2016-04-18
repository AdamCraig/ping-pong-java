import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}

  public ArrayList<Object> pingPong(Integer number) {
    ArrayList<Object> countingUp = new ArrayList<Object>();
    for (Integer index = 1 ; index <= number ; index++) {
      countingUp.add(index);
    } return countingUp;
  }

}
