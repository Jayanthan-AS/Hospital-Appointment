package data.com.hospital.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import data.com.hospital.model.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}
