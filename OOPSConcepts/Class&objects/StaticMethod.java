import java.math.*;
import java.io.*;
import java.util.*;

class Player {
    String name;
    int id;

    private static int playerCount = 0; 

    Player(String name) {
        this.name = name;
        id = ++playerCount;
    }

    static int getplayerCount() {
        return playerCount;
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println(Player.getplayerCount()); 

        Player p1 = new Player("abc");

        System.out.println(Player.getplayerCount());
}
}
