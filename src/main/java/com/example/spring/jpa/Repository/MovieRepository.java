package com.example.spring.jpa.Repository;

import com.example.spring.jpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
}
