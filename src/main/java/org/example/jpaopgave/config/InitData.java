package org.example.jpaopgave.config;

import org.example.jpaopgave.model.Unicode;
import org.example.jpaopgave.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    private final UnicodeRepository unicodeRepository;

    public InitData(UnicodeRepository unicodeRepository) {
        this.unicodeRepository = unicodeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Set<Character> characters = characters();
        Unicode unicode = new Unicode();
        characters.forEach(character -> {
            unicode.setUnicode((int) character);
            unicode.setCharacter(character);
            unicodeRepository.save(unicode);
        });

    }

    private Set<Character> characters() {
        Set<Character> characters = new HashSet<>();
        int count = 1;
        while (characters.add((char) count)) {
            count++;
        }
        return characters;
    }
}
