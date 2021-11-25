package homework3;

public class App {
    public static void main(String[] args) {
        PingPong pingpong = new PingPong();
        new Thread(()-> pingpong.ping()
        ).start();
        new Thread(()-> pingpong.pong()
        ).start();
    }
}
