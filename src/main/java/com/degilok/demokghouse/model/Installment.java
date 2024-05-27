package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "installment")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Installment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    boolean installmentOpportunity;//возможность рассрочки есть\нет
}