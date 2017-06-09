package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  private static final String helloTemplate = "Hello, %s!";
  private static final String goodbyeTemplate = "Goodbye, %s.";

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/")
  public String home() {
    return "Hello, RESTful Services!";
  }

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(helloTemplate, name));
  }

  @RequestMapping("/farewell")
  public Farewell farewell(@RequestParam(value="name", defaultValue="World") String name) {
    return new Farewell(counter.incrementAndGet(), String.format(goodbyeTemplate, name));
  }
}
