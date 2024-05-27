package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "heating")//отопление
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Heating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String central;
    String onGase;
    String electrick;
}
