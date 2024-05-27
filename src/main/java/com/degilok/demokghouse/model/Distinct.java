package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "distinct")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Distinct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String distinctName;
}
