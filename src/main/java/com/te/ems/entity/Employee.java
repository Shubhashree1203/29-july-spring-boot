package com.te.ems.entity;

import jakarta.persistence.*;
import jakarta.servlet.GenericServlet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Employee {
    @Id
    private String id;
    @Column(unique = true)
    private String employeeId;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Double salary;

    @Enumerated
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employee")
    private List<Address>addresses;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private BankAccount bankAccount;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Technology>technologies;

}
