import java.io.*;

class Player {
    static int playerCount; // Static variable

    // Static block to initialize static variables
    static {
        playerCount = 0;
        System.out.println("Static block executed!");
    }

    String name;
    int id;

    Player(String name) {
        this.name = name;
        id = ++playerCount;
    }

    void printDetails() {
        System.out.println(id + ":" + name);
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        Player p1 = new Player("xyz");
        Player p2 = new Player("abc");

        p1.printDetails(); 
        p2.printDetails(); 
    }
}
