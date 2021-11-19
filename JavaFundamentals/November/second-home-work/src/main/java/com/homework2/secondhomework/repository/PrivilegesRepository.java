package com.homework2.secondhomework.repository;

import com.homework2.secondhomework.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrivilegesRepository extends JpaRepository<Privilege, Long> {
    Optional<Privilege> findById(Long id);
}
