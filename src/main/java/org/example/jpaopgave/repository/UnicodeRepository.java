package org.example.jpaopgave.repository;

import org.example.jpaopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
    List<Unicode> findAllByUnicode(int unicode);
}
