package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "complex")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Complex {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String complexName;

}
