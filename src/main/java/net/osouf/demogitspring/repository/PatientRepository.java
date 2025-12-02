package net.osouf.demogitspring.repository;

import net.osouf.demogitspring.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
