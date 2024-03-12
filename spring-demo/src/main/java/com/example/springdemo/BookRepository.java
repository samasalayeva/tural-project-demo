package com.example.springdemo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Book,Integer> {
}
