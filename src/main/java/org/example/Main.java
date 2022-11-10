package org.example;

import Classes.Character;

public class Main {
    public static void main(String[] args) {

        Character character = new Character.CharacterBuilder()
                .addTexture(1,"texture1")
                .setName("John")
                .setLevel(1)
                .setHealth(100)
                .setExperience(50)
                .build();

        System.out.println(character.toString());

    }
}