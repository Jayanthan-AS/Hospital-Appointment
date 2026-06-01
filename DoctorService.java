package data.com.hospital.service;



import data.com.hospital.model.Doctor;
import data.com.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Get doctor by ID
    public Optional<Doctor> getDoctorById(Long id) {
        return doctorRepository.findById(id);
    }

    // Add new doctor
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Update doctor
    public Doctor updateDoctor(Long id, Doctor updatedDoctor) {
        updatedDoctor.setId(id);
        return doctorRepository.save(updatedDoctor);
    }

    // Delete doctor
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    // Search by specialization
    public List<Doctor> getDoctorsBySpecialization(String specialization) {
        return doctorRepository.findBySpecialization(specialization);
    }
}