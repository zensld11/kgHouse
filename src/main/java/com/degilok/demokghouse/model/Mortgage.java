package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mortgage")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mortgage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    boolean mortgageOpportunity;//возможность ипотеки, есть\нет
}
