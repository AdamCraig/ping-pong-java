import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/pingpong.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request,response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");

      String number = request.queryParams("number");
      Integer integerNumber = Integer.parseInt(number);
      ArrayList<Object> pingPong = pingPong(integerNumber);

      model.put("integerNumber", integerNumber);
      model.put("pingPong", pingPong);
      model.put("number", request.queryParams("number"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static ArrayList<Object> pingPong(Integer number) {
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
    }
    return countingUp;
  }

}
