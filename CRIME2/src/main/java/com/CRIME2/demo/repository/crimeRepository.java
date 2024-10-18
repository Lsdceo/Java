package com.CRIME2.demo.repository;

import com.CRIME2.demo.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface crimeRepository extends JpaRepository<Model, Integer> {
}
