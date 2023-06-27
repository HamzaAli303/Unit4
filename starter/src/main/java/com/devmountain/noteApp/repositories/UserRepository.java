package com.devmountain.noteApp.repositories;

import com.devmountain.noteApp.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<user,Long> {
    Optional<user> findByUsername(String username);
}
