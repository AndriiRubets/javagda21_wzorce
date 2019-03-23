package creational.builder.zad_game;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GameCharacter.Builder builder = new GameCharacter.Builder();
        List<GameCharacter> gameCharacters = new ArrayList<GameCharacter>();

        GameCharacter gameCharacter = builder.setName("Mark").setHealth(100).setMana(50).setPoints(10).create();
        GameCharacter tensSamCoWyzej = builder.create();
        GameCharacter gameCharacter2 = builder.setName("Peter").create();

        System.out.println(gameCharacter);
        System.out.println(tensSamCoWyzej);
        System.out.println(gameCharacter2);



    }
}
