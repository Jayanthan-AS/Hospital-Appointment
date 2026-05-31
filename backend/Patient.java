package data.com.hospital.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private String phone;

    private String email;
    private String address;
    private String medicalHistory;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public enum Gender {
        Male, Female, Other
    }
}