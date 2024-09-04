package org.example.jpaopgave.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Unicode {
    @Id
    private int unicode;

    private char character;
    private String description;
    private String name;

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }
}
