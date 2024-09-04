package org.example.jpaopgave.repository;

import org.example.jpaopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
    Set<Unicode> findAllByCharacter(char character);
    Set<Unicode> findAllByUnicode(int unicode);
}
