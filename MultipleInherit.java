interface Playable {
    void play();
}

interface Watchable {
    void watch();
}

class Movie implements Playable, Watchable {
    public void play() {
        System.out.println("Movie is playing...");
    }

    public void watch() {
        System.out.println("Watching the movie...");
    }
}

public class MultipleInherit {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.play();
        m.watch();
    }
}
