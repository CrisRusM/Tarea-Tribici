package com.example.Tribici.repository;

import com.example.Tribici.model.Uso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsoRepository extends JpaRepository<Uso,Long> {
}
