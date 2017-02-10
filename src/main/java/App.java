import java.io.Console;
import java.util.*;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("This is my first java application");
    System.out.println("Enter your a number:");
    String stringuserNumber = console.readLine();
    int intuserNumber = Integer.parseInt(stringuserNumber);
    PingPong pingPong = new PingPong();
    List<Object> pingPongResult = pingPong.runPingPong(intuserNumber);
    System.out.println(pingPongResult);
  }
}
