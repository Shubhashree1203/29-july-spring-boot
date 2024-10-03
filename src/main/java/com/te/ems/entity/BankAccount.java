package com.te.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity
public class BankAccount {
    @Id
    private Long accountNumber;
    private String ifsc;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "bankAccount")
    private Employee employee;
}
