package com.example.telephonedirectory.repository;

import com.example.telephonedirectory.entity.Enrolle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolleRepository extends JpaRepository<Enrolle,String> {
}
