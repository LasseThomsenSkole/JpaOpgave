package org.example.jpaopgave.controller;

import org.example.jpaopgave.repository.UnicodeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class UnicodeController {
    private final UnicodeRepository unicodeRepository;

    public UnicodeController(UnicodeRepository unicodeRepository) {
        this.unicodeRepository = unicodeRepository;
    }

    @GetMapping("/unicode/{i}")
    public String unicode(@PathVariable int i) {
        char c = (char) i;
        return "Unicode: " + i + " char=" + c;
    }

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        return "Char: " + c + " unicode=" + (int) c;
    }

    @GetMapping("/char/{c}/amount/{amount}")
    public Set<Character> characters (@PathVariable char c, @PathVariable int amount) {
        Set<Character> characters = new HashSet<>();
        for (int i = (int) c; i < ((int) c + amount); i++) {
            unicodeRepository.findAllByUnicode(i);
        }
        return characters;
    }
}
