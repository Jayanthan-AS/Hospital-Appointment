package data.com.hospital.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import data.com.hospital.model.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNameContainingIgnoreCase(String name);
    boolean existsByEmail(String email);
}